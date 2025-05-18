package com.learning.productservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class TokenRefreshException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public TokenRefreshException(String token, String massage) {
        super(String.format("Failed for [%s]: %s", token, massage));
    }
}
