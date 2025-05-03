package com.learning.productservices.java.Advance.JavaCollection.List.arrayListConcept;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add(1,"B");

        System.out.println("Remove A : " + arrayList.remove("A"));

        for(String a : arrayList) {
            System.out.println(a);
        }

        int x = arrayList.indexOf("A");
        System.out.println("Index : " + x);

        arrayList.clear();
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        }

    }
}
