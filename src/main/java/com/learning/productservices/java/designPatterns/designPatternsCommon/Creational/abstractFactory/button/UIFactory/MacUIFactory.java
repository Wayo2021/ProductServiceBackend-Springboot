package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.UIFactory;


import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.Button;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.CheckBox;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac.MacButton;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac.MacCheckBox;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
