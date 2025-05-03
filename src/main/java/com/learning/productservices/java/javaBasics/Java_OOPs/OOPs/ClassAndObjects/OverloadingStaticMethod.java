package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.ClassAndObjects;

public class OverloadingStaticMethod {
    public static int average(int n1, int n2){
        System.out.println("Run version A");
        return (n1+n2)/2;
    }

    public static double average(double n1, double n2){
        System.out.println("Run version B");
        return (n1+n2)/2;
    }

    public static int average(int n1, int n2, int n3){
        System.out.println("Run version C");
        return (n1+n2+n3)/3;
    }
}
