package com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.UIFactory;

import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.Button;
import com.learning.productservices.java.designPatterns.designPatternsCommon.Creational.abstractFactory.button.CheckBox;

public interface UIFactory {

    Button createButton();
    CheckBox createCheckBox();

}
