package com.learning.productservices.service.impl;

import com.learning.productservices.exception.AlreadyExistsException;
import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.ProductTypeDto;
import com.learning.productservices.model.entities.TblProductTypes;
import com.learning.productservices.repository.ProductTypeRepository;
import com.learning.productservices.service.ProductTypeService;
import com.learning.productservices.exception.errorMessage.errorDetails.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;



    private TblProductTypes productTypeConvertToObject(ProductTypeDto productTypeDtoParam) {
        TblProductTypes tblProductTypesConvert = new TblProductTypes();

        tblProductTypesConvert.setId(productTypeDtoParam.getId());
        tblProductTypesConvert.setProductTypeName(productTypeDtoParam.getProductTypeName());
        tblProductTypesConvert.setProductTypeCode(productTypeDtoParam.getProductTypeCode());

        return tblProductTypesConvert;
    }

    @Override
    public Optional<TblProductTypes> saveProductType(ProductTypeDto productTypeDtoParam) throws ResourceNotFoundException {

        try {

            Optional<TblProductTypes> productTypesId = productTypeRepository.findById(productTypeDtoParam.getId());
            if (!productTypesId.isPresent()) {
                TblProductTypes tblProductTypesConverted = productTypeConvertToObject(productTypeDtoParam);
                TblProductTypes tblProductTypesSaved = productTypeRepository.save(tblProductTypesConverted);
                return Optional.of(tblProductTypesSaved);
            } else {
                throw new AlreadyExistsException(ErrorMessages.ERROR_ALREADY_EXISTS + productTypesId);
            }

        } catch (Exception ex) {

            throw  new ResourceNotFoundException(ex.getMessage());

        }
    }

    @Override
    public List<TblProductTypes> getProductTypeAll() {

        List<TblProductTypes> tblProductTypesAll = productTypeRepository.findAll();

        return tblProductTypesAll;
    }

    @Override
    public Optional<TblProductTypes> getProductTypeById(Long id) {

        Optional<TblProductTypes> productTypesId = productTypeRepository.findById(id);

        return productTypesId;
    }

    @Override
    public void deleteProductType(Long id) {
        productTypeRepository.deleteById(id);
    }

    @Override
    public Optional<TblProductTypes> updateProductType(ProductTypeDto productTypeDto, Long id) {

        TblProductTypes productTypes = productTypeRepository.findById(id).get();

        if (Objects.nonNull(productTypeDto.getProductTypeCode()) && !"".equalsIgnoreCase(productTypeDto.getProductTypeCode())) {
            productTypes.setProductTypeCode(productTypeDto.getProductTypeCode());
        }

        if (Objects.nonNull(productTypeDto.getProductTypeName()) && !"".equalsIgnoreCase(productTypeDto.getProductTypeName())) {
            productTypes.setProductTypeName(productTypeDto.getProductTypeName());
        }

        return Optional.of(productTypeRepository.save(productTypes));
    }


}
