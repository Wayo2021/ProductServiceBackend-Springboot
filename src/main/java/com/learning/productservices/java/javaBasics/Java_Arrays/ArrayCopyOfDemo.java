package com.learning.productservices.java.javaBasics.Java_Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
//                "Affogato",   [0]
//                "Americano",  [1]
//                "Cappuccino", [2] this -> [0]
//                "Corretto",   [3]
//                "Cortado",    [4]
//                "Doppio",     [5]
//                "Espresso",   [6]
//                "Frappucino", [7]
//                "Freddo",     [8] this -> [6]
//                "Lungo",      [9]
//                "Macchiato",  [10]
//                "Marocchino", [11]
//                "Ristretto"   [12]
    }
}
