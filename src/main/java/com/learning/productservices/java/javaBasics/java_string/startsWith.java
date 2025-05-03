package com.learning.productservices.java.javaBasics.java_string;

public class startsWith {
    public static void main(String[] args) {
        //method startWith
        //return String

        String str = "wwwgooglecom";
        System.out.println(str);

        String startstr1 = "www";

        boolean retval1 = str.startsWith(startstr1);
        System.out.println("starts with: " + startstr1 + " ? " + retval1);
    }
}
