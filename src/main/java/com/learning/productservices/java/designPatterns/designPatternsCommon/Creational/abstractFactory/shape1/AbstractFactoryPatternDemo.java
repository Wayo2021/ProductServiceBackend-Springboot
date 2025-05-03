package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.shape1;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");

        shape1.draw2();

        Shape shape2 = shapeFactory.getShape("SQUARE");

        shape2.draw2();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory1.getShape("ROUNDED RECTANGLE");

        shape3.draw2();

        Shape shape4 = shapeFactory1.getShape("ROUNDED SQUARE");

        shape4.draw2();
    }
}
