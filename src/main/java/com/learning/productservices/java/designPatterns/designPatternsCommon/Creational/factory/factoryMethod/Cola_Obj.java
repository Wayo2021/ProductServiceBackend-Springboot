package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factoryMethod;

public class Cola_Obj implements Beverage{
    @Override
    public void brew() {
        make();
        System.out.println("โคล่าได้แล้วครับ");
    }

    private void make(){
        String doSomeThing = "เปิดขวดแล้วเทใส่แก้ว";
    }
}
