package com.zmz.design.abstractfactory;

/**
 * @Description: 具体产品实现-MacOSButton
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 19:52
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("恭喜 你创建了 MacOSButton.");
    }
}
