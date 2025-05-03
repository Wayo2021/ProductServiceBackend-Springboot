package com.learning.productservices.java.javaBasics.java_string;

public class contentEquals {
    public static void main(String[] args) {
        //method: contentEquals(CharSequence chars), contentEquals(StringBuffer buffer)
        //return: boolean

        String word1 = "Hello.account.";
        String word2 = "Hello";
        boolean b1 = word1.contentEquals(word2);
        System.out.println("contentEquals: " + b1);//true

        boolean b2 = word2.contentEquals(new StringBuffer("Hello"));
        System.out.println("contentEquals: " + b2);//true
    }
}
