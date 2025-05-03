package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Barista_Factory baristaFactory = new Barista_Factory();

        //สั่งกาแฟกับบาริสต้า
        Beverage order1 = baristaFactory.order("coffee");

        //สั่งให้ทำมาให้ก็จะได้กาแฟออกมา
        order1.brew();

        //สั่งกาแฟกับบาริสต้า
        Beverage order2 = baristaFactory.order("greentea");

        //สั่งเหมือนกับเครื่องดื่มอื่นๆ
        order2.brew();

        //สั่งกาแฟกับบาริสต้า
        Beverage order3 = baristaFactory.order("cola");

        //สั่งเหมือนกับเครื่องดื่มอื่นๆ
        order3.brew();
    }
}
