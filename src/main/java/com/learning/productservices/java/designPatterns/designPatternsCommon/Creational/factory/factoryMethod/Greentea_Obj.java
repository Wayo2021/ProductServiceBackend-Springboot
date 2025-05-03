package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factoryMethod;

public class Greentea_Obj implements Beverage{
    @Override
    public void brew() {
        make();
        System.out.println("ชาเขียวได้แล้วครับ");
    }

    private void make(){
        String doSomeThing = "เอาใบชาเขียวอ่อนใส่แก้วเติมน้ำร้อน";
    }
}
