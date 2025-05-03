package com.learning.productservices.java.javaBasics.java_string;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        //method equalsIgnoreCase(Object anObject)
        //return boolean

        String word = "Hello";
        boolean same = word.equalsIgnoreCase("hellO");

        System.out.println("equals: " + same);//true
    }
}
