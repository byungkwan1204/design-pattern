package com.example.design_pattern.creational_pattern.abstract_factory_method.factories;

import com.example.design_pattern.creational_pattern.abstract_factory_method.buttons.Button;
import com.example.design_pattern.creational_pattern.abstract_factory_method.buttons.WindowsButton;
import com.example.design_pattern.creational_pattern.abstract_factory_method.checkboxes.Checkbox;
import com.example.design_pattern.creational_pattern.abstract_factory_method.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
