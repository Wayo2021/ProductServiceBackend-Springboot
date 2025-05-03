package com.learning.productservices.service;

import com.learning.productservices.model.dto.ProductDto;

public interface CheckService {
    void validateRequest(ProductDto productDto);
}
