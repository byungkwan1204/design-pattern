package com.example.design_pattern.creational_pattern.factory_method.factory;

import com.example.design_pattern.creational_pattern.factory_method.buttons.Button;
import com.example.design_pattern.creational_pattern.factory_method.buttons.WindowButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
