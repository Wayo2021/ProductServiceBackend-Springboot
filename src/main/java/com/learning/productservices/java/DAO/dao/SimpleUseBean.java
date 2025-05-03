package com.learning.productservices.java.DAO.dao;

public class SimpleUseBean {
    public static void main(String[] args) {
        ProductDAO clock = new ProductDAO(15, "watch", "time", 350);
        System.out.println(clock.getProductName() + " price " + clock.getPrice() + " bath");
    }
}
