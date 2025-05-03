package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac;


import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
