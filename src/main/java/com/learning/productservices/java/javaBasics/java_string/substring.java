package com.learning.productservices.java.javaBasics.java_string;

public class substring {
    public static void main(String[] args) {
        //method substring(int index)
        //return string

//        String word = "Should".substring(3);
//        System.out.println("substring: " + word);//uld
//
//        String word2 = "Should".substring(1, 3);
//        System.out.println("substring: " + word2);//ho

        //O2307P230719821

//        String word3 = "O2307P230719821".substring(5);
//        System.out.println("Number : " + word3);//ho


        String wordValue = "O2307P230719821";
        String wordSubstr = "";
        String wordPreCode = "O";
        String wordMedCode = "P";

        if (wordValue.startsWith(wordPreCode)) {
            wordSubstr = wordValue.substring(5);
            if (wordSubstr.startsWith(wordMedCode)) {
                System.out.println(wordSubstr);
            }
        }




    }
}
