package com.learning.productservices.java.javaUtilities;

public class CheckBoolean {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Booleaen: " + checkBoolean(a,b,c));
    }

    public static boolean checkBoolean(int a, int b, int c) {

        if (1 == a) {
            return true;
        } else if ( 2 == b) {
            return true;
        } else if ( 3 == c) {
            return true;
        }
        return false;
    }
}
