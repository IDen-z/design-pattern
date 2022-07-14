package com.zmz.design.abstractfactory;

/**
 * @Description: 具体产品实现-MacOSCheckbox
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 19:58
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("加油 你创建了 MacOSCheckbox");
    }
}


