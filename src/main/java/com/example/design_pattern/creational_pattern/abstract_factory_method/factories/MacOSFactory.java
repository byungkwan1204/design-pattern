package com.example.design_pattern.creational_pattern.abstract_factory_method.factories;

import com.example.design_pattern.creational_pattern.abstract_factory_method.buttons.Button;
import com.example.design_pattern.creational_pattern.abstract_factory_method.buttons.MacOSButton;
import com.example.design_pattern.creational_pattern.abstract_factory_method.checkboxes.Checkbox;
import com.example.design_pattern.creational_pattern.abstract_factory_method.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
