package com.zmz.design.factory.method;

/**
 * @Description: 基础创建工厂
 * @Author: Zhu Mengze
 * @Date: 2021/9/26 19:14
*/
public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 子类会重写该方法，进而生成对应的button对象
     */
    public abstract Button createButton();

}
