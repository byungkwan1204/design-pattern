package com.example.design_pattern.creational_pattern.factory_method;

import com.example.design_pattern.creational_pattern.factory_method.factory.Dialog;
import com.example.design_pattern.creational_pattern.factory_method.factory.HtmlDialog;
import com.example.design_pattern.creational_pattern.factory_method.factory.WindowDialog;


/**
 * <h3> 팩토리 메서드 패턴 </h3>
 * <ul>
 *     <li> 클라이언트가 특정 객체를 직접 생성하지않고 팩토리 역할을 하는 객체에 위임하는 패턴 </li>
 *     <li> 팩토리는 인터페이스로 추상화되어 구체 팩토리의 변경을 유연하게 한다. </li>
 *     -> (HtmlButton - HtmlDialog), (WindowButton - WindowDialog)
 * </ul>
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
