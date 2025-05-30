package com.example.design_pattern.creational_pattern.abstract_factory_method;

import com.example.design_pattern.creational_pattern.abstract_factory_method.app.Application;
import com.example.design_pattern.creational_pattern.abstract_factory_method.factories.GUIFactory;
import com.example.design_pattern.creational_pattern.abstract_factory_method.factories.MacOSFactory;
import com.example.design_pattern.creational_pattern.abstract_factory_method.factories.WindowsFactory;

/**
 * <h3> 추상 팩토리 메서드 패턴 </h3>
 * <ul>
 *     <li> 특정 그룹에 속하는 여러 객체들을 하나의 팩토리로 묶어서 생성할 수 있는 패턴 </li>
 *     -> (MacOSButton, MacOSCheckbox), (WindowsButton, WindowsCheckbox)
 * </ul>
 */
public class Demo {

    public static void main(String[] args) {

        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {

        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;
    }
}
