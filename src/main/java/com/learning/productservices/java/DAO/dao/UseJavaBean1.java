package com.learning.productservices.java.DAO.dao;

public class UseJavaBean1 {

//     เมธอดที่ส่ง JavaBean กลับ
    public static ProductDAO getProductDAO(){
        ProductDAO productDAO = new ProductDAO(12,"Soup","clean",35);
        return productDAO;
    }

//    เมธอดที่รับข้อมูลจาก JavaBean
    public static void print(ProductDAO productDAO){
        System.out.println(productDAO.getProductName() + " price " + productDAO.getPrice() + " bath.");
    }

    public static void main(String[] args) {
        ProductDAO productDAO = getProductDAO();
        print(productDAO);
    }
}
