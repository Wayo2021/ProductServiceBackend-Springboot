package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.OS.Mac.WIN;

import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
