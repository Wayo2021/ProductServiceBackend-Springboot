package com.learning.productservices.java.javaBasics.java_string;

public class compareTo {
    public static void main(String[] args) {
        //method: compareTo(String someWord)
        //return: int

        String word1 = "Hello";
        String word2 = "World";
        int diff = word1.compareTo(word2);

        System.out.println("compareTo: " + diff);//-15
    }
}
