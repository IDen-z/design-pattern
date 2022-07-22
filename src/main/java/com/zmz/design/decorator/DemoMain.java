package com.zmz.design.decorator;


/**
 * 装饰器模式  一般用于 对象的组合职责  装饰可通过以当前类或对象为参数的创建方法或构造函数来识别。
 *
 * 装饰器模式的理解难度还是有的 应该经常复习  考虑他和代理模式的区别与联系
 */
public class DemoMain {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        // 也可以只进行编码 不进行压缩
        DataSourceDecorator dataSourceDecorator = new EncryptionDecorator(new FileDataSource("1"));


        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }

}
