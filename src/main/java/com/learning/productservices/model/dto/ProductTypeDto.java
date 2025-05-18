package com.learning.productservices.model.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductTypeDto {

    private Long id;
    private String productTypeCode;
    private String productTypeName;

}
