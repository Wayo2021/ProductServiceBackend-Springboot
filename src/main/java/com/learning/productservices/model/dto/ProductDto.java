package com.learning.productservices.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productCode;
    private String productTypeCode;
    private Long productType_id;
}
