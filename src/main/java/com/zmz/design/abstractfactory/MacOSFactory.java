package com.zmz.design.abstractfactory;

/**
 * @Description: 具体工厂-MacOSFactory
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 20:03
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

}
