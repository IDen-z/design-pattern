package com.zmz.design.abstractfactory;

/**
 * @Description: 具体产品实现-WindowsCheckbox
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 20:00
 */
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("加油 你创建了 WindowsCheckbox");
    }
}
