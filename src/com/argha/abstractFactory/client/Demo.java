package com.argha.abstractFactory.client;

import com.argha.abstractFactory.factory.GUIFactory;
import com.argha.abstractFactory.factory.MacGUIFactory;
import com.argha.abstractFactory.factory.WindowsGUIFactory;

public class Demo {


    private static Application configureApplication(String OS){
        Application app;
        GUIFactory guiFactory;
        if(OS.equals("Mac"))
            guiFactory=new MacGUIFactory();
        else
            guiFactory=new WindowsGUIFactory();
        return new Application(guiFactory);
    }

    public static  void main(String[] args){
        Application app =configureApplication("Mac");
        app.fillForm();
    }
}
