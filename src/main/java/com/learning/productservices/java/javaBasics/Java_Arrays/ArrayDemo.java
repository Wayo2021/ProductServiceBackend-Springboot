package com.learning.productservices.java.javaBasics.Java_Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        //declares an array of integers
        int[] anArray;

        //allocates memory for 10 integers
        anArray = new int[10];

        //initialize first element
        anArray[0] = 100;
        //initialize second element
        anArray[1] = 200;
        // and so three
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;


        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);
        System.out.println("Element 4 at index 3: " + anArray[3]);
        System.out.println("Element 5 at index 4: " + anArray[4]);
        System.out.println("Element 6 at index 5: " + anArray[5]);
        System.out.println("Element 7 at index 6: " + anArray[6]);
        System.out.println("Element 8 at index 7: " + anArray[7]);
        System.out.println("Element 9 at index 8: " + anArray[8]);
        System.out.println("Element 10 at index 9: " + anArray[9]);




    }
}
