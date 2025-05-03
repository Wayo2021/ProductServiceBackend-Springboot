package com.learning.productservices.java.DAO.dao;

import java.util.ArrayList;

public class UseJavaBean2 {
    public static ArrayList<ProductDAO> getProductDAOList(){
        ProductDAO clock = new ProductDAO(15, "Watch", "watch time", 350);
        ProductDAO shampoo = new ProductDAO(16, "Shampoo", "Hair clean", 135);
        ProductDAO cream = new ProductDAO(17, "Cream", "skin care", 69);

        ArrayList<ProductDAO> list = new ArrayList<ProductDAO>();
        list.add(clock);
        list.add(shampoo);
        list.add(cream);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ProductDAO> productDAOS = getProductDAOList();
        for (ProductDAO productDAO1: productDAOS){
            System.out.println(productDAO1.getProductName() + " " + productDAO1.getProductDetail());
        }
    }
}
