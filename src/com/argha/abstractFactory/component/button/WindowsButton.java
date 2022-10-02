package com.argha.abstractFactory.component.button;

import com.argha.abstractFactory.component.Button;

public class WindowsButton implements Button {

    @Override
    public void clickButton() {
        System.out.println("Click windows button");
    }
}
