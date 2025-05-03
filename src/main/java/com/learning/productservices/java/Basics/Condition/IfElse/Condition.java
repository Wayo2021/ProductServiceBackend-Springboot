package com.learning.productservices.java.Basics.Condition.IfElse;

import java.util.Arrays;

public class Condition {
    public static final String[] ACTIVITY = {"Replace","Delete Swap"};
    public static void main(String[] args) {


//        List<String> offer = new ArrayList<>();
//        List<String> equip = new ArrayList<>();
//
//        String stdOffer = "";
//        String stdEquip = "2";
//
//        if (ObjectUtils.isEmpty(stdOffer)) {
//            offer.add(stdOffer);
//        }
//        if (ObjectUtils.isEmpty(stdEquip)) {
//            equip.add(stdEquip);
//        }
//
//
//        if (!ObjectUtils.isEmpty(offer)) {
//            boolean isListEqual = offer.stream().sorted().collect(Collectors.toList()).equals(
//                    equip.stream().sorted().collect(Collectors.toList()));
//            if (!isListEqual) {
//                System.out.println("Not found");;
//            }
//        }

        String replace = "Replace";
        String del_swp = "Delete Swap";


        if (Arrays.asList(Arrays.stream(Condition.ACTIVITY).toArray()[0]).contains(del_swp)) {
            System.out.println("Replace");
        } else {
            System.out.println("Delete Swap");
        }

    }
}
