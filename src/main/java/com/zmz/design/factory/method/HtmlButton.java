package com.zmz.design.factory.method;

/**
 * @Description: 生产的具体产品-HtmlButton
 * @Author: Zhu Mengze
 * @Date: 2021/9/26 15:13
*/
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("HtmlButton渲染方法！");
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! HtmlButton says - 'Hello World!'");
    }
}
