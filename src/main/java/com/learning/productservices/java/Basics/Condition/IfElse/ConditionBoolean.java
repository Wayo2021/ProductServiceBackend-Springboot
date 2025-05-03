package com.learning.productservices.java.Basics.Condition.IfElse;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class ConditionBoolean {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        String str1 = "1";

        validate(str1, str);


        if (!ObjectUtils.isEmpty(str)) {
            System.out.println("Require");
        }

    }
    private static void validate(String str1, List<String> str) {

        if (str1 == "1") {
            str.add("have");
        }
    }

}
