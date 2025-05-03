package com.learning.productservices.java.javaUtilities;

import org.springframework.util.ObjectUtils;

public class CheckEmptyNull {
    public static void main(String[] args) {
        String isEmpty = "d";
        String isNull = "";

        if (ObjectUtils.isEmpty(isEmpty)) {
            System.out.println("Empty");
        }
        if (null == isNull) {
            System.out.println("Null");
        }
    }
}
