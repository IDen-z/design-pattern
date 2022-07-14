package com.zmz.design.abstractfactory;

/**
 * @Description: 另一个具体产品实现-windowsButton
 * @Author: Zhu Mengze
 * @Date: 2021/9/27 19:54
*/
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("恭喜 你创建了 WindowsButton");
    }
}
