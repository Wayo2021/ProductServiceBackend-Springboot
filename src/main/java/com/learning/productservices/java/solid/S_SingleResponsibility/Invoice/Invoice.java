package com.learning.productservices.java.solid.S_SingleResponsibility.Invoice;

public class Invoice {
    private String book;
    private int quanlity;
    private double discountRate;
    private double taxRate;

    public void calculateTotal(String book) {
        double total = (discountRate*quanlity)-taxRate;
    }
}
