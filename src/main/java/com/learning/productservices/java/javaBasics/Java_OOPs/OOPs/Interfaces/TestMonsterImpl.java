package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.Interfaces;

public class TestMonsterImpl {
    public static void main(String[] args) {
        Monster m1 = new FireMonster();
        Monster m2 = new WaterMonster();
        Monster m3 = new StoneMonster();

        System.out.println(m1.attacks());
        System.out.println(m2.attacks());
        System.out.println(m3.attacks());
    }
}
