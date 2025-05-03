package com.learning.productservices.java.javaBasics.java_string;

public class indexOf {
    public static void main(String[] args) {
        //method: indexOf(int ch)
        //return: int

        String word = "Hello";
        int index = word.indexOf('o');
        System.out.println("indexOf: " + index);//4

        int index2 = word.indexOf('e',1);
        System.out.println("indexOf: " + index2);//1
    }
}
