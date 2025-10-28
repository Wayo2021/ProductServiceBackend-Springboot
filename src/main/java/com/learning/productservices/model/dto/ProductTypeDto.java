package com.learning.productservices.model.dto;

import com.learning.productservices.model.request.RequestParamDto;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class ProductTypeDto extends RequestParamDto {

    private Long id;
    private String productTypeCode;
    private String productTypeName;

}
