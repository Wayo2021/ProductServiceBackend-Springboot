package com.learning.productservices.service.impl;

import com.learning.productservices.exception.errorMessage.ErrorMessages;
import com.learning.productservices.exception.AlreadyExistsException;
import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.ProductTypeDto;
import com.learning.productservices.model.entities.ProductType;
import com.learning.productservices.repository.ProductTypeRepository;
import com.learning.productservices.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;



    private ProductType productTypeConvertToObject(ProductTypeDto productTypeDtoParam) {
        ProductType productTypeConvert = new ProductType();

        if (!ObjectUtils.isEmpty(productTypeDtoParam.getId())) {
            productTypeConvert.setId(productTypeDtoParam.getId());
        }
        productTypeConvert.setProductTypeName(productTypeDtoParam.getProductTypeName());
        productTypeConvert.setProductTypeCode(productTypeDtoParam.getProductTypeCode());

        return productTypeConvert;
    }

    @Override
    public Optional<ProductType> saveProductType(ProductTypeDto productTypeDtoParam) throws ResourceNotFoundException {

        try {

            if (!ObjectUtils.isEmpty(productTypeDtoParam.getId())) {
                Optional<ProductType> productTypesId = productTypeRepository.findById(productTypeDtoParam.getId());
                if (!productTypesId.isPresent()) {
                    ProductType productTypeConverted = productTypeConvertToObject(productTypeDtoParam);
                    ProductType productTypeSaved = productTypeRepository.save(productTypeConverted);
                    return Optional.of(productTypeSaved);
                } else {
                    throw new AlreadyExistsException(ErrorMessages.ERROR_ALREADY_EXISTS + productTypesId);
                }
            } else {
                ProductType productTypeConverted = productTypeConvertToObject(productTypeDtoParam);
                ProductType productTypeSaved = productTypeRepository.save(productTypeConverted);
                return Optional.of(productTypeSaved);
            }

        } catch (Exception ex) {

            throw  new ResourceNotFoundException(ex.getMessage());

        }
    }

    @Override
    public List<ProductType> getProductTypeAll() {

        List<ProductType> productTypeAll = productTypeRepository.findAll();

        return productTypeAll;
    }

    @Override
    public Optional<ProductType> getProductTypeById(Long id) {

        Optional<ProductType> productTypesId = productTypeRepository.findById(id);

        return productTypesId;
    }

    @Override
    public void deleteProductType(Long id) {
        productTypeRepository.deleteById(id);
    }

    @Override
    public Optional<ProductType> updateProductType(ProductTypeDto productTypeDto, Long id) {

        ProductType productTypes = productTypeRepository.findById(id).get();

        if (Objects.nonNull(productTypeDto.getProductTypeCode()) && !"".equalsIgnoreCase(productTypeDto.getProductTypeCode())) {
            productTypes.setProductTypeCode(productTypeDto.getProductTypeCode());
        }

        if (Objects.nonNull(productTypeDto.getProductTypeName()) && !"".equalsIgnoreCase(productTypeDto.getProductTypeName())) {
            productTypes.setProductTypeName(productTypeDto.getProductTypeName());
        }

        return Optional.of(productTypeRepository.save(productTypes));
    }


}
