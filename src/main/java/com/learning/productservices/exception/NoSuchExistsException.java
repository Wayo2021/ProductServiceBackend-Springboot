package com.learning.productservices.exception;

public class NoSuchExistsException extends RuntimeException {
    public NoSuchExistsException(){

    }
    public NoSuchExistsException(String message) {
        super(message);
    }
}
