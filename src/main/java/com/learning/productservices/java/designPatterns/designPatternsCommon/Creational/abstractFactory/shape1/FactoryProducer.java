package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.shape1;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if (rounded) {
            return new RoundedShapeFactory();
        }else {
            return new ShapeFactory();
        }
    }
}
