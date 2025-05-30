package com.example.design_pattern.creational_pattern.abstract_factory_method.factories;

import com.example.design_pattern.creational_pattern.abstract_factory_method.buttons.Button;
import com.example.design_pattern.creational_pattern.abstract_factory_method.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
