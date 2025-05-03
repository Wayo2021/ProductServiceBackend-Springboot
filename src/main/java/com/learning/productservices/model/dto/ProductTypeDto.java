package com.learning.productservices.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class ProductTypeDto {

    private Long id;
    private String productTypeCode;
    private String productTypeName;

}
