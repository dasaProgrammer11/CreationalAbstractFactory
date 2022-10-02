package com.argha.abstractFactory.factory;

import com.argha.abstractFactory.component.Button;
import com.argha.abstractFactory.component.CheckBox;

public interface GUIFactory {


    public Button createButton();
    public CheckBox createCheckBox();
}
