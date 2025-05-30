package com.example.design_pattern.behavioral_pattern.factory_method;

import com.example.design_pattern.behavioral_pattern.factory_method.factory.Dialog;
import com.example.design_pattern.behavioral_pattern.factory_method.factory.HtmlDialog;
import com.example.design_pattern.behavioral_pattern.factory_method.factory.WindowDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
