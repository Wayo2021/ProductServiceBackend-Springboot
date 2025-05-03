package com.learning.productservices.java.javaBasics.Java_Arrays;

public class MutidimArrayDemo {
    public static void main(String[] args) {

        String[][] names = {
                {"Mr.", "Mrs.", "Ms."},
                {"Smith", "Jones", "Yo"}
        };

        //Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        //Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
        //Mr. Yo
        System.out.println(names[0][0] + names[1][2]);
    }
}
