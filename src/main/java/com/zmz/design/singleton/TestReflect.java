package com.zmz.design.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
//        String name = InnerClassSingleton.class.getName();
//        System.err.println(name);
//        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
//        InnerClassSingleton instance = InnerClassSingleton.getInstance();
//        // 普通的单例模式 可以利用反射进行多实例的初始化
//        // 如果采用静态内部类或者饿汉式时 可以在私有构造器中加以判断防止多实例
//        // 懒汉式 (双检锁模式) 暂时无法防止反射
//        System.err.println(innerClassSingleton);
//        System.err.println(instance);
//
//        // 测试双检锁
//        // 发现测试不通过
//        // 因为懒汉式 双检锁模式 是需要用的时候才去构造
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(String.class);
//        constructor.setAccessible(true);
//        Singleton singleton = constructor.newInstance("1");
//        Singleton singleton2 = Singleton.getInstance("1");
//        System.err.println(singleton);
//        System.err.println(singleton2);

        // 还有一点值得注意的 可以通过序列化和反序列化的方式破坏单例模式
        // 利用readResolve()
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSeri"));
        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        oos.writeObject(instance2);
        oos.close();
        System.err.println(instance2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSeri"));
        InnerClassSingleton innerClassSingleton2 = (InnerClassSingleton) ois.readObject();
        ois.close();
        System.err.println(innerClassSingleton2);


    }
}
