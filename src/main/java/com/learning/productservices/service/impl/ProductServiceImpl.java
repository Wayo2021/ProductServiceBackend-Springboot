package com.learning.productservices.service.impl;

import com.learning.productservices.exception.errorMessage.ErrorMessages;
import com.learning.productservices.exception.AlreadyExistsException;
import com.learning.productservices.exception.MustNotBeNullException;
import com.learning.productservices.exception.NoSuchExistsException;
import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.model.entities.ProductType;
import com.learning.productservices.model.entities.Product;
import com.learning.productservices.model.request.RequestParamDto;
import com.learning.productservices.repository.ProductRepository;
import com.learning.productservices.repository.ProductTypeRepository;
import com.learning.productservices.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;


    private Product convertProductJsonToObject(ProductDto productDtoParam) {

        Product productConvert = new Product();
        productConvert.setId(productDtoParam.getId());
        productConvert.setProductName(productDtoParam.getProductName());
        productConvert.setProductPrice(productDtoParam.getProductPrice());
        productConvert.setProductCode(productDtoParam.getProductCode());

        return productConvert;
    }

    @Override
    public Optional<Product> saveProduct(ProductDto productDtoParam) throws AlreadyExistsException {

        try {

            this.checkProductCodeIsAlready(productDtoParam.getProductCode()); // 1 == 1
            List<Product> productByCode = productRepository.queryByProductCode(productDtoParam.getProductCode());

            if (productByCode.size() == 0) {

                Product productConverted = convertProductJsonToObject(productDtoParam); // json -> object

                this.checkProductTypeCodeIsNull(productDtoParam.getProductTypeCode()); // 1 == null
                Optional<ProductType> productTypeByCode = productTypeRepository.queryByProductTypeCode(productDtoParam.getProductTypeCode());

                if (productTypeByCode.isPresent()) {

                    productConverted.setProductType(productTypeByCode.get());
                    Product productSaved = productRepository.save(productConverted);
                    return Optional.of(productSaved);

                }
            }

            return null;

        } catch (AlreadyExistsException aee) {

            throw new AlreadyExistsException(aee.getMessage());

        } catch (NoSuchExistsException nee) {

            throw new NoSuchExistsException(nee.getMessage());

        }

    }

    @Override
    public List<Product> getProductsAll() {

        try {
            List<Product> productAll = productRepository.findAll();

            return productAll;

        } catch (Exception e) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_FOUND, "Products"));
        }

    }

    @Override
    public Optional<Product> getProductById(Long id) {

        Optional<Product> productById = productRepository.findById(id);

        if (productById.isPresent()) {
            return productById;
        } else {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_EXIST , id));
        }

    }

    @Override
    public List<ProductDto> getProductByQuery(Map<String, String> param) throws NoSuchExistsException{

        String productCode = param.get("productCode");
        String productName = param.get("productName");

        List<Product> productsList = new ArrayList<>();

        productsList = productRepository.queryProductCodeAndProductName(productCode, productName);

        if (productsList.size() == 0) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_NOT_FOUND.replace("%s", "") + "Query by " + productCode + " " + "&" + " " + productName);
        }

        List<ProductDto> productDtoList = new ArrayList<>();

        for (Product products : productsList) {

            ProductDto productDto = ProductDto.builder()
                    .id(products.getId())
                    .productName(products.getProductName())
                    .productPrice(products.getProductPrice())
                    .productCode(products.getProductCode())
                    .productTypeCode(products.getProductType().getProductTypeCode())
                    .productType_id(products.getProductType().getId())
                    .build();

            productDtoList.add(productDto);
        }
        return productDtoList;
    }

    @Override
    public Optional<Product> updateProduct(RequestParamDto requestParamDto, Long id) throws RuntimeException {

        Product productUpdate = productRepository.findById(id).get();
        Optional<Product> productByCode = productRepository.findByProductCode(requestParamDto.getProduct().getProductCode());

        if (productUpdate == null) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_FIELD_BY_EQUAL, "product id" ,id));
        }
        if (!productByCode.isPresent()) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_FIELD_BY_EQUAL, "product code" , requestParamDto.getProduct().getProductCode()));
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductName()) && !"".equalsIgnoreCase(requestParamDto.getProduct().getProductName())) {
            productUpdate.setProductName(requestParamDto.getProduct().getProductName());
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductPrice()) && requestParamDto.getProduct().getProductPrice().compareTo(BigDecimal.ZERO) != 0) {
            productUpdate.setProductPrice(requestParamDto.getProduct().getProductPrice());
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductCode()) && !"".equalsIgnoreCase(requestParamDto.getProduct().getProductCode())) {
            productUpdate.setProductCode(requestParamDto.getProduct().getProductCode());
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductTypeCode()) && !"".equalsIgnoreCase(requestParamDto.getProduct().getProductTypeCode())) {
            ProductType productTypeByCode = productTypeRepository.findByProductTypeCode(requestParamDto.getProduct().getProductTypeCode()).orElseGet(() -> {

                throw new NoSuchExistsException(ErrorMessages.ERROR_FIELD_BY_EQUAL + "product type code" + requestParamDto.getProduct().getProductTypeCode());

            });

            productUpdate.setProductType(productTypeByCode);
        }

        Product productSave = productRepository.save(productUpdate);
        return Optional.of(productSave);
    }

//    @Override
//    public ProductDto updateProductField(Long id) {
//
//        Product productField = productRepository.findById(id).orElseThrow(() -> new NoSuchExistsException(ErrorMessages.ERROR_ALREADY_EXISTS + id));
//        Product product = productRepository.save(productField);
//
//        return mapToProductDto(product);
//    }
//
//    private Product mapToProductDto(Product product) {
//        ProductDto productDto = new ProductDto();
//
//        productDto.setId(productDto.getId());
//        productDto.setProductName(product.getProductName());
//        productDto.setProductCode(product.getProductCode());
//        productDto.setProductPrice(product.getProductPrice());
////        productDto.setProductTypeCode(product.getProductTypeCode());
//
//        return productDto;
//    }

    @Override
    public void deleteProductById(Long id) {

        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_FOUND + id));
        }

    }

    @Override
    public Product updateProductByField(Long id, Map<String, Object> fields) {//11, productCode = PD01
        Optional<Product> existingProduct = productRepository.findById(id);

        if (existingProduct.isPresent()) {
            fields.forEach((key, value) -> {//productCode, PD01
                Field field = ReflectionUtils.findField(Product.class, key);//PD01
                field.setAccessible(true);
                ReflectionUtils.setField(field, existingProduct.get(), value);//productCode, PD02(old), PD01
            });

            return productRepository.save(existingProduct.get());

        } else {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_ALREADY_EXISTS + id));
        }
    }

    @Override
    public void validateProduct(RequestParamDto requestParamDto) throws RuntimeException {

        if (ObjectUtils.isEmpty(requestParamDto.getProduct().getProductName())) {
            throw new MustNotBeNullException(String.format(ErrorMessages.ERROR_MUST_NOT_BE_NULL , "productName"));
        }
        if (ObjectUtils.isEmpty(requestParamDto.getProduct().getProductCode())) {
            throw new MustNotBeNullException(String.format(ErrorMessages.ERROR_MUST_NOT_BE_NULL , "productCode"));
        }
        if (ObjectUtils.isEmpty(requestParamDto.getProduct().getProductPrice())) {
            throw new MustNotBeNullException(String.format(ErrorMessages.ERROR_MUST_NOT_BE_NULL , "productPrice"));
        }
        if (ObjectUtils.isEmpty(requestParamDto.getProduct().getProductTypeCode())) {
            throw new MustNotBeNullException(String.format(ErrorMessages.ERROR_MUST_NOT_BE_NULL , "productTypeCode"));
        }

    }

    public void checkProductCodeIsAlready(String id) {

        this.productRepository.findByProductCode(id).ifPresent(pc -> {
            throw new AlreadyExistsException(String.format(ErrorMessages.ERROR_ALREADY_EXISTS, id));
        });

    }

    public void checkProductTypeCodeIsNull(String id) {

        Optional.ofNullable(this.productTypeRepository.findByProductTypeCode(id).orElseThrow(() ->
                new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_EXIST , id))));

    }

}
