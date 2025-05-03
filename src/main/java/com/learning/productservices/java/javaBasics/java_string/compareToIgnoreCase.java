package com.learning.productservices.java.javaBasics.java_string;

public class compareToIgnoreCase {
    public static void main(String[] args) {
        //method: compareToIgnoreCase(String someWord)
        //return: int

        String word1 = "hEllO";
        String word2 = "HeLLo";
        int diff = word1.compareToIgnoreCase(word2);

        System.out.println("compareToIgnoreCase: " + diff);//0
    }
}
