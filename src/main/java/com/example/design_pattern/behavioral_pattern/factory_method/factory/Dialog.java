package com.example.design_pattern.behavioral_pattern.factory_method.factory;

import com.example.design_pattern.behavioral_pattern.factory_method.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {

        // .... other code ......

        Button oButton = createButton();
        oButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
