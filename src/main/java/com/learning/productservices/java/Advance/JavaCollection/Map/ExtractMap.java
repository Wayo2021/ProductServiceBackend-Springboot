package com.learning.productservices.java.Advance.JavaCollection.Map;

import java.util.HashMap;
import java.util.Map;

public class ExtractMap {
    public static void main(String[] args) {

        HashMap<String, String> lang = new HashMap<>();
//        lang.put("01","Java");
        lang.put("02","Python");
//        lang.put("03","Golang");
//        lang.put("04","Javascript");

        checkContains(lang);
    }

    public static void checkContains(Map<String, String> extract) {
        if (!extract.containsKey("02")) {
            System.out.println("Not found!");
            throw new RuntimeException("Not found");
        }

        String num = extract.get("01");
        String lang = extract.get("02");

        System.out.println(num);
        System.out.println(lang);
    }
}
