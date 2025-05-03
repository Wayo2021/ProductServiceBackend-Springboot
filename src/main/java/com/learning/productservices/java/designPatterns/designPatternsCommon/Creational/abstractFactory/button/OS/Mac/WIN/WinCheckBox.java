package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac.WIN;

import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win CheckBox");
    }
}
