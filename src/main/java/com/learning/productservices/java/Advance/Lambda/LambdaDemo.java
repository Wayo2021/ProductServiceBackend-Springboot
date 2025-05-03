package com.learning.productservices.java.Advance.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
    Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
    List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        System.out.println("Max of integers: " + listOfIntegers.stream().reduce(Integer::max).get());

        System.out.println("Min of integers: " + listOfIntegers.stream().reduce(Integer::min).get());

        System.out.println("Sum of integers: " + listOfIntegers.stream().reduce(Integer::sum).get());

    }
}
