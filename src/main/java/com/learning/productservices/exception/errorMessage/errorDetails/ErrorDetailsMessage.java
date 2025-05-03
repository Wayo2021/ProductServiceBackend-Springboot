package com.learning.productservices.exception.errorMessage.errorDetails;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorDetailsMessage {

    private String messageError;
    private String fieldParameter;

    public ErrorDetailsMessage(String fieldParameter) {
        this.fieldParameter = fieldParameter;
    }

    public ErrorDetailsMessage(String messageError, String fieldParameter) {
        this.messageError = messageError;
        this.fieldParameter = fieldParameter;
    }
}
