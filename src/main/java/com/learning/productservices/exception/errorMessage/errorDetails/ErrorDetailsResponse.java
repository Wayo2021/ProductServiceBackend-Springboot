package com.learning.productservices.exception.errorMessage.errorDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetailsResponse {
    private int statusCode;
//    private String message;
    private List<Object> message;
}
