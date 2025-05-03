package com.learning.productservices.java.javaBasics.java_string;

public class trim {
    public static void main(String[] args) {
        //method: trime()
        //return: String

//        String word = " Hello World ".trim();
        String chk = "ABC";
        String val = " ";

        if (!chk.trim().contains(val)) {
            System.out.println("......");
        } else {
            System.out.println("//////");
        }
//        System.out.println("trim: " + word);//Hello World
    }
}
