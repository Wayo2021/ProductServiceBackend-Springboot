package com.learning.productservices.exception;

//@Data
public class MustNotBeNullException extends RuntimeException{

//    private int status;
//    private String message;
//    private List<Object> error = new ArrayList<>();
//    private String strError;

    public MustNotBeNullException(){}
    public MustNotBeNullException(String message) {
        super(message);
    }
//    public MustNotBeNullException(String message, List<Object> error) {
//        super(message);
//        this.message = message;
//        this.error = error;
//    }
//
//    public MustNotBeNullException(String message, String error) {
//        super(message);
//        this.message = message;
//        this.strError = error;
//    }
}
