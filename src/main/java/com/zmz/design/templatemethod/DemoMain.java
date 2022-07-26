package com.zmz.design.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoMain {
    /**
     * 模板方法设计模式也比较容易理解
     *
     * 通过一个抽象类  将公用的设计方法抽取出来  主要用于抽取公共算法 (也就是算法子步骤有变化)的设计模式
     *
     *
     *
     *
     */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("请输入用户名: ");
        String userName = reader.readLine();
        System.out.print("请输入密码: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("请输入文本内容: ");
        String message = reader.readLine();

        System.out.println("\n请选择需要发布的社交平台.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        boolean post = network.post(message);

    }

}
