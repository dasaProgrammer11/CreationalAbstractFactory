package com.argha.abstractFactory.factory;

import com.argha.abstractFactory.component.Button;
import com.argha.abstractFactory.component.CheckBox;
import com.argha.abstractFactory.component.button.WindowsButton;
import com.argha.abstractFactory.component.checkbox.WindowsCheckBox;

public class WindowsGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
