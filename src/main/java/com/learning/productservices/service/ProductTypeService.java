package com.learning.productservices.service;

import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.ProductTypeDto;
import com.learning.productservices.model.entities.TblProductTypes;

import java.util.List;
import java.util.Optional;

public interface ProductTypeService {

//    DTO or Entities enter Args

    Optional<TblProductTypes> saveProductType(ProductTypeDto productTypeDto) throws ResourceNotFoundException;

    List<TblProductTypes> getProductTypeAll();

    Optional<TblProductTypes> getProductTypeById(Long id);

    void deleteProductType(Long id);

    Optional<TblProductTypes> updateProductType(ProductTypeDto productTypeDto, Long id);

}
