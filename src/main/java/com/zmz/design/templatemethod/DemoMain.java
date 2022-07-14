package com.zmz.design.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoMain {

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
