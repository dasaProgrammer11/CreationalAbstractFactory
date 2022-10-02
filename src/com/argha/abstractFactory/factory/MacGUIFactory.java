package com.argha.abstractFactory.factory;

import com.argha.abstractFactory.component.Button;
import com.argha.abstractFactory.component.CheckBox;
import com.argha.abstractFactory.component.button.MacButton;
import com.argha.abstractFactory.component.checkbox.MacCheckBox;

public class MacGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
