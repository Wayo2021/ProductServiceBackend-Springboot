package com.learning.productservices.java.Basics.Looping.For;

public class ForDemo {
    public static void main(String[] args) {

//        List<String> str1 = new ArrayList<>();

//        str1.add("FC-hxxxx-1230");
//        str1.add("FC-hxxxx-1231");
//        str1.add("FC-hxxxx-1232");
        String str1 = "FC-hxxxx-1230";

//        for (int i = 0; i < str1.length(); i++) {
            String runningOrderNo = String.format(str1 + "_" +  "%d",  (int)(Math.random() * 10));
//            StringBuilder sb = new StringBuilder(str1.toString());
//            sb.append(runningOrderNo);//now original string is changed
            print(runningOrderNo);
//        }

//        StringBuilder sb = new StringBuilder(str1.toString());
//        sb.append(str1);//now original string is changed
//        System.out.println(sb);//prints Hello Java

    }

    public static void print(String number){
        System.out.println("runningNumber: " + number);
    }





}
