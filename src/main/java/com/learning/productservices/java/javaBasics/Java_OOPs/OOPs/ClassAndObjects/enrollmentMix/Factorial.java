package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects.enrollmentMix;

public class Factorial {
    public static double fac(int n ){
        if(n <= 1)
            return 1;
        else 
            return n*fac(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        double sum = fac(n);
        System.out.println("Factorial: " + n + " = " + sum);
    }
}
