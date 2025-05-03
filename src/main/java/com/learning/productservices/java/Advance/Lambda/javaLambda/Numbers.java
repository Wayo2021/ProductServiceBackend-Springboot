package com.learning.productservices.java.Advance.Lambda.javaLambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Numbers {
    public static void main(String[] args) {

        //-------------------------------------------------------1 exam simple
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.forEach( (n) -> {
//            System.out.println(n);
//        });



        //-------------------------------------------------------2 exam simple
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach( method );
    }
}
