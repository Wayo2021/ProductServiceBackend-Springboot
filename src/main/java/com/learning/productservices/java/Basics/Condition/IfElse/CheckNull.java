package com.learning.productservices.java.Basics.Condition.IfElse;

import java.util.ArrayList;
import java.util.List;

public class CheckNull {
    public static void main(String[] args) {
        String isNull = null;
        String isEmpty = "";
        List<String> isList = new ArrayList<>();
        isList.add("");


        if ("".equals(isNull)) {
            System.out.println("NULL");
        }

        if (isList.size() > 0) {
            System.out.println("Size" + "");
        }
    }
}
