package com.learning.productservices.java.javaBasics.java_string;

public class endsWith {
    public static void main(String[] args) {
        //method: endsWith(String word)
        //return: boolean

        String word = "Hello";
        boolean lastChar = word.endsWith("o");
        System.out.println("endsWith " + lastChar);//true
    }
}
