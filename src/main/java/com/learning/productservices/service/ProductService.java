package com.learning.productservices.service;

import com.learning.productservices.exception.AlreadyExistsException;
import com.learning.productservices.exception.NoSuchExistsException;
import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.model.request.RequestParamDto;
import com.learning.productservices.model.entities.Product;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProductService {

    Optional<Product> saveProduct(ProductDto productDtoParam) throws AlreadyExistsException;

    List<Product> getProductsAll();

    Optional<Product> getProductById(Long id);

    List<ProductDto> getProductByQuery(Map<String, String> param) throws NoSuchExistsException;

    Optional<Product> updateProduct(RequestParamDto requestParamDto, Long id) throws RuntimeException;

//    ProductDto updateProductField(Long id);

    void deleteProductById(Long id);

    Product updateProductByField(Long id, Map<String, Object> fields);

    void validateProduct(RequestParamDto requestParamDto) throws RuntimeException;



}
