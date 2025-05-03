package com.learning.productservices.java.Advance.JavaCollection.Map;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {

        HashMap<String, String> lang = new HashMap<>();
        lang.put("ja","Java");
        lang.put("py","Python");
        lang.put("go","Golang");
        lang.put("js","Javascript");
//        System.out.println("HashMap: "+lang);

        for (String key : lang.keySet()){
            System.out.println("keySet: =" + key);
        }

//        for (String value : lang.values()){
//            System.out.println("values: =" + value);
//        }
//
//        for (HashMap.Entry<String,String> entry : lang.entrySet()){
//            System.out.println("Key: =" + entry.getKey() + " Value: =" + entry.getValue());
//            System.out.println("Key/Value: =" + entry);
//        }
//
//        System.out.println("Get: " + lang.get("go"));
//        System.out.println("Key: "+lang.keySet());
//        System.out.println("Value: "+lang.values());
//        System.out.println("Key/Value mappings: "+lang.entrySet());
//        System.out.println("Replace: "+lang.replace("go", "C++"));
//        System.out.println("Remove: "+lang.remove("js"));

//        lang.clear();
//        lang.compute();
//        lang.computeIfAbsent("c#", key -> "C#");
//        lang.computeIfPresent();
//        lang.merge("Javascript", "JS",(oldValue, newValue) -> oldValue + "/" + newValue);
//        lang.clone();
//        if (lang.containsKey("go")) System.out.println("go");
//        if (lang.containsValue("Golang")) System.out.println("Golang");
//        int size = lang.size();
//        boolean empty = lang.isEmpty();
//        -------------------------------


    }
}
