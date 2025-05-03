package com.learning.productservices.java.javaBasics.java_string;

public class toCharArray {
    public static void main(String[] args) {
        //method toCharArray
        //return string

        String s = new String("Welcome To");
        char[] array = s.toCharArray();
        int lengt = array.length;
        System.out.println("toCharArray: " + s.toCharArray());
        System.out.println("Size of char is: " + lengt);
        for (int i = 0; i < lengt; i++) {
            System.out.print(array[i]);
        }

    }
}
