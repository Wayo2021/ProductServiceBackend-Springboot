package com.learning.productservices.java.solid.S_SingleResponsibility.Invoice;

public class Bad_Example_Invoice {
    private String book;
    private int quanlity;
    private double discountRate;
    private double taxRate;

    public void calculateTotal(String book) {

    }

    public void printInvoice(String book) {
        System.out.println("Book");
        System.out.println("Quanlity");
        System.out.println("Discount Rate");
        System.out.println("Tax Rate");

    }

    public void saveInvoice(String book) {
//        repoBook.save(book);
    }
}
