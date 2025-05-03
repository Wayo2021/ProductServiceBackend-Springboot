package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.Compositions;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return "[Author: " + name + " (" + email + " )]";
    }
}
