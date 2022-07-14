package com.zmz.design.abstractfactory;


/**
 * @Description: 客户端代码-应用层
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 20:07
 */


/**
 * 这个Application将所有工厂下生产的产品，无需考虑他是什么工厂建立的，只要能够正常
 * 生产出产品，那么根据抽象产品的定义，其一定可以实现产品可以实现的功能
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
