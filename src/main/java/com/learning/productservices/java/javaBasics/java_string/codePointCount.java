package com.learning.productservices.java.javaBasics.java_string;

public class codePointCount {
    public static void main(String[] args) {
        //Method: codePointCount(int start, int end);
        //return: int

        String word = "Hello";
        int character = word.codePointCount(0, 3);
        System.out.println("codePointCount: " + character);//3
    }
}
