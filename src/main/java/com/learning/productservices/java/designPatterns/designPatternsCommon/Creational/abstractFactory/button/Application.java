package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button;

import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.UIFactory.UIFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
