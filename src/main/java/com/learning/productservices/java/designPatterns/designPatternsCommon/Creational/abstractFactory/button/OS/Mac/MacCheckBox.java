package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac;


import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
