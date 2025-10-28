package com.learning.productservices.model.dto;

import com.learning.productservices.model.request.RequestParamDto;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor

public class ProductDto extends RequestParamDto {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productCode;
    private String productTypeCode;
    private Long productType_id;
}
