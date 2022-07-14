package com.zmz.design.abstractfactory;

/**
 * @Description: 另一个具体工厂-WindowsFactory
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 20:04
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}