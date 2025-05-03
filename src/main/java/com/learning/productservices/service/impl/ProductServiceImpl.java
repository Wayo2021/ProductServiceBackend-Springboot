package com.learning.productservices.service.impl;

import com.learning.productservices.exception.AlreadyExistsException;
import com.learning.productservices.exception.MustNotBeNullException;
import com.learning.productservices.exception.NoSuchExistsException;
import com.learning.productservices.exception.errorMessage.errorDetails.ErrorMessages;
import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.model.entities.TblProductTypes;
import com.learning.productservices.model.entities.TblProducts;
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


    private TblProducts convertProductToObject(ProductDto productDtoParam) {

        TblProducts productConvert = new TblProducts();
        productConvert.setId(productDtoParam.getId());
        productConvert.setProductName(productDtoParam.getProductName());
        productConvert.setProductPrice(productDtoParam.getProductPrice());
        productConvert.setProductCode(productDtoParam.getProductCode());

        return productConvert;
    }

    @Override
    public Optional<TblProducts> saveProduct(ProductDto productDtoParam) throws AlreadyExistsException {

        try {

            this.checkProductCodeIsAlready(productDtoParam.getProductCode()); // 1 == 1
            List<TblProducts> productByCode = productRepository.queryByProductCode(productDtoParam.getProductCode());

            if (productByCode.size() == 0) {

                TblProducts productConverted = convertProductToObject(productDtoParam); // json -> object

                this.checkProductTypeCodeIsNull(productDtoParam.getProductTypeCode()); // 1 == null
                Optional<TblProductTypes> productTypeByCode = productTypeRepository.queryByProductTypeCode(productDtoParam.getProductTypeCode());

                if (productTypeByCode.isPresent()) {

                    productConverted.setTblProductTypes(productTypeByCode.get());
                    TblProducts productSaved = productRepository.save(productConverted);
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
    public List<TblProducts> getProductsAll() {

        try {
            List<TblProducts> tblProductsAll = productRepository.findAll();

            return tblProductsAll;

        } catch (Exception e) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_FOUND, "Products"));
        }

    }

    @Override
    public Optional<TblProducts> getProductById(Long id) {

        Optional<TblProducts> productById = productRepository.findById(id);

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

        List<TblProducts> productsList = new ArrayList<>();

        productsList = productRepository.queryProductCodeAndProductName(productCode, productName);

        if (productsList.size() == 0) {
            throw new NoSuchExistsException(ErrorMessages.ERROR_NOT_FOUND.replace("%s", "") + "Query by " + productCode + " " + "&" + " " + productName);
        }

        List<ProductDto> productDtoList = new ArrayList<>();

        for (TblProducts products : productsList) {

            ProductDto productDto = ProductDto.builder()
                    .id(products.getId())
                    .productName(products.getProductName())
                    .productPrice(products.getProductPrice())
                    .productCode(products.getProductCode())
                    .productTypeCode(products.getTblProductTypes().getProductTypeCode())
                    .productType_id(products.getTblProductTypes().getId())
                    .build();

            productDtoList.add(productDto);
        }
        return productDtoList;
    }

    @Override
    public Optional<TblProducts> updateProduct(RequestParamDto requestParamDto, Long id) throws RuntimeException {

        TblProducts tblProductsUpdate = productRepository.findById(id).get();
        Optional<TblProducts> productByCode = productRepository.findByProductCode(requestParamDto.getProduct().getProductCode());

        if (tblProductsUpdate == null) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_FIELD_BY_EQUAL, "product id" ,id));
        }
        if (!productByCode.isPresent()) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_FIELD_BY_EQUAL, "product code" , requestParamDto.getProduct().getProductCode()));
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductName()) && !"".equalsIgnoreCase(requestParamDto.getProduct().getProductName())) {
            tblProductsUpdate.setProductName(requestParamDto.getProduct().getProductName());
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductPrice()) && requestParamDto.getProduct().getProductPrice().compareTo(BigDecimal.ZERO) != 0) {
            tblProductsUpdate.setProductPrice(requestParamDto.getProduct().getProductPrice());
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductCode()) && !"".equalsIgnoreCase(requestParamDto.getProduct().getProductCode())) {
            tblProductsUpdate.setProductCode(requestParamDto.getProduct().getProductCode());
        }

        if (Objects.nonNull(requestParamDto.getProduct().getProductTypeCode()) && !"".equalsIgnoreCase(requestParamDto.getProduct().getProductTypeCode())) {
            TblProductTypes tblProductTypesByCode = productTypeRepository.findByProductTypeCode(requestParamDto.getProduct().getProductTypeCode()).orElseGet(() -> {

                throw new NoSuchExistsException(ErrorMessages.ERROR_FIELD_BY_EQUAL + "product type code" + requestParamDto.getProduct().getProductTypeCode());

            });

            tblProductsUpdate.setTblProductTypes(tblProductTypesByCode);
        }

        TblProducts productSave = productRepository.save(tblProductsUpdate);
        return Optional.of(productSave);
    }

    @Override
    public ProductDto updateProductField(Long id) {

        TblProducts productField = productRepository.findById(id).orElseThrow(() -> new NoSuchExistsException(ErrorMessages.ERROR_ALREADY_EXISTS + id));
        TblProducts tblProducts = productRepository.save(productField);

        return mapToProductDto(tblProducts);
    }

    private ProductDto mapToProductDto(TblProducts tblProducts) {
        ProductDto productDto = new ProductDto();

        productDto.setId(productDto.getId());
        productDto.setProductName(productDto.getProductName());
        productDto.setProductCode(productDto.getProductCode());
        productDto.setProductPrice(productDto.getProductPrice());
        productDto.setProductTypeCode(productDto.getProductTypeCode());

        return productDto;
    }

    @Override
    public void deleteProductById(Long id) {

        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            throw new NoSuchExistsException(String.format(ErrorMessages.ERROR_NOT_FOUND + id));
        }

    }

    @Override
    public TblProducts updateProductByField(Long id, Map<String, Object> fields) {//11, productCode = PD01
        Optional<TblProducts> existingProduct = productRepository.findById(id);

        if (existingProduct.isPresent()) {
            fields.forEach((key, value) -> {//productCode, PD01
                Field field = ReflectionUtils.findField(TblProducts.class, key);//PD01
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
