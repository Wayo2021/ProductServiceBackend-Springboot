package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button;


import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.UIFactory.WinUIFactory;

public class MainAbsFac {
    public static void main(String[] args) {
        Application application = new Application(new WinUIFactory());
        application.paint();
    }
}
