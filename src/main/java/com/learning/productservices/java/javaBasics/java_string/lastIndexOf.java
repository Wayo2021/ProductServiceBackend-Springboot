package com.learning.productservices.java.javaBasics.java_string;

public class lastIndexOf {
    public static void main(String[] args) {
        //method: lastIndexOf(String str)
        //return: int

        String word = "Hello";
        int index = word.lastIndexOf('o');
        System.out.println("lastIndexOf: " + index);//4

        int index2 = word.lastIndexOf('o', 4);
        System.out.println("lastIndexOf: " + index2);//4
    }
}
