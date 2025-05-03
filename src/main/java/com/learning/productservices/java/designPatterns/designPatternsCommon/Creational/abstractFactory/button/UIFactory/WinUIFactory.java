package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.UIFactory;

import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.Button;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.CheckBox;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac.WIN.WinButton;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac.WIN.WinCheckBox;

public class WinUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
