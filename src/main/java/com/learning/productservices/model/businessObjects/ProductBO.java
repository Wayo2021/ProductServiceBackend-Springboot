package com.learning.productservices.model.businessObjects;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductBO {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productCode;
    private String productTypeCode;
    private Long productType_id;

}
