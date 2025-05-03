package com.learning.productservices.java.javaBasics.Java_OOPs.OOPs.Polymorphisms;

public class TestMonster {
    public static void main(String[] args) {
        FireMonster fire = new FireMonster();
        callAttack1(fire);
        System.out.println();

        Monster m1 = new FireMonster();
        Monster m2 = new WaterMonster();
        Monster m3 = new StoneMonster();
        Monster m4 = new Monster();

        callAttack2(m1);
        callAttack2(m2);
        callAttack2(m3);
        callAttack2(m4);
    }

//    call a subclass
    public static void callAttack1(FireMonster fire){
        System.out.println(fire.attack());
    }

//    call superclass and subclass
    public static void callAttack2(Monster fwsm){
        System.out.println(fwsm.attack());
    }
}
