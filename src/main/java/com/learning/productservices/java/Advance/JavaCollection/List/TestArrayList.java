package com.learning.productservices.java.Advance.JavaCollection.List;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    private static final String RED = "RED";
    public static void main(String[] args) {
        List<String> items = new ArrayList<String>();
        items.add("Red");
        items.add("Blue");
//        items.add("Green");
//        items.add("Brown");

//        String color = "Red";


//        for (String name : items){
//            if (items.get(0).equals(color)) {
//                System.out.println("True");
//                break;
//            } else {
//                System.out.println("False");
//            }
//        }




//        ###Explain Method*/*/*/*/*/*/*/*/*/
//        -------------------------------
//        items.add(Value);
//        -------------------------------
//        items.get(index);
//        -------------------------------
//        items.size();
//        -------------------------------
//        items.contains(Value);
//        -------------------------------
//        items.indexOf(Value);
//        -------------------------------
//        items.set(index, Value);
//        -------------------------------
//        items.remove(Value);
//        -------------------------------
//        items.clear();
//        -------------------------------
//        items.isEmpty();
//        -------------------------------
//        for (String name : items){
//            System.out.println("Show Item: " +name);
//        }
////        -------------------------------
//        System.out.println();
//        System.out.println("get Item: " +items.get(1));
//        System.out.println("size Item: " +items.size());
//        System.out.println("contains Item: " +items.contains("Red"));
//        System.out.println("indexOf Item: " +items.indexOf("Red"));
//        System.out.println("set Item: " +items.set(1, "Orange"));
//        System.out.println("get Item: " +items.get(1));
//        System.out.println("remove Item: " +items.remove("Brown"));
//        items.clear();
//        boolean empty = items.isEmpty();
//        System.out.println("empty Item: " +empty);
////        -------------------------------
//        for (String name : items){
//            System.out.println("Show Item: " +name);
//        }
//        -------------------------------





        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Brown");
        colors.add("Yellow");

        List<String> isCheckColor = new ArrayList<>();
        if (checkColor(colors)) {
            System.out.println("Color is: RED");
        } else {
            System.out.println("Any color");
        }

    }

    public static boolean checkColor(List<String> colors) {
        return colors.stream().filter(color -> color.equals(colors.get(0))).findFirst().isPresent();
    }
}
