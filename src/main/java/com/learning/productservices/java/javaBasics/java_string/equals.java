package com.learning.productservices.java.javaBasics.java_string;

public class equals {
    public static void main(String[] args) {
        //method equals(Object anObject)
        //return boolean

        String word = "Hello";
        boolean same = word.equals("Hello");

        System.out.println("equals: " + same);//true
    }
}
