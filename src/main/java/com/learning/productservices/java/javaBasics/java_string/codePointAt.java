package com.learning.productservices.java.javaBasics.java_string;

public class codePointAt {
    public static void main(String[] args) {
        //method: codePointAt(int index)
        //return: int

        String word = "Hello";
        int code = word.codePointAt(1);
        System.out.println("codePointAt: " + code);//101
    }
}
