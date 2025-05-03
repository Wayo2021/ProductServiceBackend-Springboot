package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.shape1;


public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("RECTANGLE")){

            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {

            return new Square();
        }
        return null;
    }
}
