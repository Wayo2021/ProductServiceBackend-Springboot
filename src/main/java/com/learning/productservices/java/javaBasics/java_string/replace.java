package com.learning.productservices.java.javaBasics.java_string;

public class replace {
    public static void main(String[] args) {
        //method: replace(char oldChar, char newChar)
        //return: String

        String word = "Hello";
        String newWord = word.replace('o', 'a');
        System.out.println("replace: " + newWord);//Hella

        String word2 = "Hello World";
        String newWord2 = word2.replace("Hello", "Java");
        System.out.println("replace : " + newWord2);//Java World
    }
}
