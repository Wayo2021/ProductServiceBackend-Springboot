package com.learning.productservices.java.javaBasics.java_string;

public class codePointBefore {
    public static void main(String[] args) {
        //method: codePointbefore(int index)
        //return: int
        String word = "Hello";
        int code = word.codePointBefore(1);
        System.out.println("codePointBefore: " + code);//72
    }
}
