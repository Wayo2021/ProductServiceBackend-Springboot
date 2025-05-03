package com.learning.productservices.java.javaBasics.Java_Exceptions;

import java.util.ArrayList;
import java.util.Objects;

public class Exception_Test {

    public boolean checkException() {
        return false;
    }
    public static void main(String[] args) {
        boolean isBoolean = false;

        String strName = "$.activity";
        String strActivity = "Qualify";

        ArrayList<String> items = new ArrayList<String>();
        items.add("Red");
        items.add("Blue");
        items.add("Green");
        items.add("Brown");

        if( !isBoolean) {
            if (strName.equals("$.activity") && !Objects.isNull(items) && strActivity.equals("Qualify")) {
                String activity, activity2 = "";
                for (String color : items) {
                    activity = items.get(0);
                    activity2 = items.get(1);
                    if (!Objects.isNull(activity)) {
                        throw new RuntimeException("Activity : "+activity.replace("d", activity2));
                    }

                }
            }
        }
    }
}
