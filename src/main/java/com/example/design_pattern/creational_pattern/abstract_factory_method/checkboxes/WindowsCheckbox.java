package com.example.design_pattern.creational_pattern.abstract_factory_method.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
