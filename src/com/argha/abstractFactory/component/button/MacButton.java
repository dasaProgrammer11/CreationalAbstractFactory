package com.argha.abstractFactory.component.button;

import com.argha.abstractFactory.component.Button;

public class MacButton implements Button {

    @Override
    public void clickButton() {
        System.out.println("clicking Mac Button");
    }
}
