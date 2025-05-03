package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.Compositions;

public class Book {

    private String name;
    private Author bookAuthor;
    private int price;

    public Book(String name, Author bookAuthor, int price){
        this.name = name;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public String toString(){
        return name + " by " + bookAuthor + " - " + price + " bath";
    }

}
