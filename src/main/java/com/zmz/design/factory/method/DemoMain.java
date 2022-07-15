package com.zmz.design.factory.method;


/**
 *  工厂方法模式就是一个抽象工厂，一个抽象产品
 *
 *  抽象工厂决定了创建产品的抽象方法
 *
 *  具体工厂确定了具体产品的生成方法
 *
 *  抽象产品给出了产品能实现的抽象接口
 *
 *  具体产品则通过实现抽象产品的抽象接口来表明成功生产不同的产品
 *
 *
*/
public class DemoMain {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        System.out.println(dialog.getClass().getName());
        runBusinessLogic();
    }

    /**
     * 通常根据配置或环境选项选择工厂。
     */
    // 这里不应该是选择工厂 而是选择哪个工厂生成哪个具体的产品
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * 所有客户端代码都应该通过抽象接口方式与工厂和产品一起使用
     * 这样它就不会关心它与哪个工厂合作以及它返回什么样的产品。
     */
    static void runBusinessLogic() {
        // 工厂生产出的不同的dialog通过抽象接口决定产品的使用
        dialog.renderWindow();
    }
}
