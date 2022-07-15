package com.zmz.design.factory.method;

/**
 * @Description: 基础创建工厂
 * @Author: Zhu Mengze
 * @Date: 2021/9/26 19:14
*/
public abstract class Dialog {

    /**
     * 这里的抽象类 Dialog 作为抽象工厂
     * 限定了每个dialog实例 必须实现createButton方法 也就是通过这个方法实例化
     * 不同的dialog工厂限定了不同的button产品
     * Button则是一个接口 限定了每个button都有一个render方法
     *
     * 该类 就是工厂方法的核心
     */

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 子类会重写该方法，进而生成对应的button对象
     */
    public abstract Button createButton();

}
