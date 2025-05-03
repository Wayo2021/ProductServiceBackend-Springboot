package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.factory.factoryMethod;

public class Barista_Factory {
    public Beverage order(String beverageType) {

        if(beverageType.equals("coffee")) {
            return new Coffee_Obj();

        } else if (beverageType.equals("greentea")) {
            return new Greentea_Obj();

        } else if (beverageType.equals("cola")) {
            return new Cola_Obj();
        }

        return null;
    }
}
