package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.shape1;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("ROUNDED RECTANGLE")){

            return new RoundedRectangle();

        } else if (shapeType.equalsIgnoreCase("ROUNDED SQUARE")) {

            return new RoundedSquare();
        }
        return null;
    }
}
