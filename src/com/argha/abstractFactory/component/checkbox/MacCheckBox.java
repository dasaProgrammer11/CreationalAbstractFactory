package com.argha.abstractFactory.component.checkbox;

import com.argha.abstractFactory.component.CheckBox;

public class MacCheckBox implements CheckBox {

    @Override
    public void tick() {
        System.out.println("tick mac checkbox");
    }
}
