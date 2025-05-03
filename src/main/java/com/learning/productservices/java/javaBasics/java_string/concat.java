package com.learning.productservices.java.javaBasics.java_string;

public class concat {
    public static void main(String[] args) {
        //method: concat(String word)
        //return: String

        String word1 = "Hello";
        String word2 = "World";
        String newWorld = word1.concat(word2);

        System.out.println("concat: " + newWorld);//HelloWorld
    }
}
