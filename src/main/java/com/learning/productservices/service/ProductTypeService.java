package com.learning.productservices.service;

import com.learning.productservices.exception.ResourceNotFoundException;
import com.learning.productservices.model.dto.ProductTypeDto;
import com.learning.productservices.model.entities.ProductType;

import java.util.List;
import java.util.Optional;

public interface ProductTypeService {

//    DTO or Entities enter Args

    Optional<ProductType> saveProductType(ProductTypeDto productTypeDto) throws ResourceNotFoundException;

    List<ProductType> getProductTypeAll();

    Optional<ProductType> getProductTypeById(Long id);

    void deleteProductType(Long id);

    Optional<ProductType> updateProductType(ProductTypeDto productTypeDto, Long id);

}
