package com.learning.productservices.service.impl;

import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.service.CheckService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

@Service
public class CheckServiceImpl implements CheckService {

    @Override
    public void validateRequest(ProductDto productDto) {
        if (ObjectUtils.isEmpty(productDto.getProductName())) {
            System.out.println("Check empty");
        }
        if (Objects.isNull(productDto.getProductName())) {
            System.out.println("Check Null");
        }
    }
}
