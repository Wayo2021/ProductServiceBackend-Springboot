package com.learning.productservices.java.Basics.Enum;

public class DayEnum {
    enum Day {
        MONDAY, TUESDAY, WENDESDAY, THURSDAY, SATURDAY, SUNDAY
    }

    public String calculate(Day d) {
//        return switch (d) {
//            case SATURDAY, SUNDAY -> "week-end";
//            default -> {
//                int remainingWorkDays = 5 - d.ordinal();
//            }
//        }
        return "";
    }
}
