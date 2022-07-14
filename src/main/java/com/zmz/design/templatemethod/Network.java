package com.zmz.design.templatemethod;

/**
 * @Description: 基础抽象社交网络类
 * @Author: Zhu Mengze
 * @Date: 2021/9/29 15:48
 */

/**
 *  这是一个基础算法类
 *
 *  其固定步骤一致，但具体步骤不同的子类具有不同的实现
 *
 *  这个时候可以利用模板方法设计模式，将其公共方法抽取出来
 *
 */

public abstract class Network {

    String userName;
    String password;

    Network() {
    }

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract void logOut();


}
