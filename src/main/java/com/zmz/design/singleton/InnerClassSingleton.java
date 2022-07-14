package com.zmz.design.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 利用静态内部类的方法 实现懒加载
 */
public class InnerClassSingleton implements Serializable {

    private static final long serialVersionUID = 444203445677988857L;

    // 饿汉式的单例模式会利用jvm的类加载保证单例
    // 懒汉式除了经典的双检锁模式外 还可利用静态内部类的方式实现
    public static void main(String[] args) {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        System.err.println(instance);
        System.err.println(instance2);

    }

    private static class InnerClassSingletonHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    // 私有化构造函数
    private InnerClassSingleton() {
        if (InnerClassSingletonHolder.instance != null) {
            throw new RuntimeException("不允许初始化多个实例");
        }
    }

    // 提供公共方法
    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonHolder.instance;
    }

    public Object readResolve() throws ObjectStreamException {
        return InnerClassSingletonHolder.instance;
    }

}
