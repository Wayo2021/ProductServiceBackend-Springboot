package com.learning.productservices.java.javaBasics.java_string;

public class contains {
    public static void main(String[] args) {
        //method: contains(CharSequence char)
        //return: boolean

        String word1 = "Hello.account.saInfo";
        String word2 = "Hello.saInfo";
        boolean b = word1.contains(word2);

        System.out.println("contains: " + b);//false
    }
}
