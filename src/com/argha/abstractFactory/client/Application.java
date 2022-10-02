package com.argha.abstractFactory.client;

import com.argha.abstractFactory.component.Button;
import com.argha.abstractFactory.component.CheckBox;
import com.argha.abstractFactory.factory.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void fillForm(){
        button.clickButton();
        checkBox.tick();
    }
}
