package com.learning.productservices.model.request;

import com.learning.productservices.model.dto.ProductDto;
import com.learning.productservices.model.dto.ProductTypeDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestParamDto {

    private ProductDto product;
    private ProductTypeDto productType;

}
