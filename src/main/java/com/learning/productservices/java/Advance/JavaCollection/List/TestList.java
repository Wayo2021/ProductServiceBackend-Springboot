package com.learning.productservices.java.Advance.JavaCollection.List;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        List<String> fullFrame = new ArrayList<>();
        fullFrame.add("Blue");
        List<String> hybrid = new ArrayList<>();
        hybrid.add("R");
        List<String> request = new ArrayList<>();
        request.add("Red");
        List<String> override = new ArrayList<>();
        override.add("Rd");

        boolean isBoolean = false;
        isBoolean = checkFullFrame(request, override, fullFrame);
        if (!isBoolean) {
            isBoolean = checkHybrid(request, override, hybrid);
            if (isBoolean) {
                System.out.println("Hybrid");
            } else {
                checkError();
            }
        } else {
            System.out.println("Full Frame");
        }
    }
    public static boolean checkFullFrame(List<String> request, List<String> override, List<String> fullFrame) {
        boolean isBoolean = false;
        //request == fullFrame
        if (request.equals(fullFrame)) {
            isBoolean = true;
            System.out.println(isBoolean);
        } else {
            //override == fullFrame
            if (override.equals(fullFrame)) {
                isBoolean = true;
                System.out.println(isBoolean);
            }
        }
        return isBoolean;
    }
    public static boolean checkHybrid(List<String> request, List<String> override, List<String> hybrid) {
        boolean isBoolean = false;
        //request == hybrid
        if (request.equals(hybrid)) {
            isBoolean = true;
            System.out.println(isBoolean);
        } else {
            //override == hybrid
            if (override.equals(hybrid)) {
                isBoolean = true;
                System.out.println(isBoolean);
            }
        }
        return isBoolean;
    }

    public static void checkError() {
        System.out.println("Error");
    }
}
