package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factoryMethod;

public class Coffee_Obj implements Beverage{
    @Override
    public void brew() {
        make();
        System.out.println("กาแฟได้แล้วครับ");
    }

    private void make(){
        String doSomeThing = "ฉีกชองเทใส่แก้วเติมน้ำร้อน";
    }
}
