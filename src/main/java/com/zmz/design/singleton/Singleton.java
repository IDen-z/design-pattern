package com.zmz.design.singleton;

/**
 * @Description: 单例设计模式--双重检查模式--避免多线程出现问题以及饿汉式带来的内存浪费
 * @Author: Zhu Mengze
 * @Date: 2021/9/26 8:51
 */
public class Singleton {

    // 私有化实例
    // 由于new Singleton()不是原子性操作
    // volatile的作用是为了禁止指令重排序
    // 保证双重检查锁的第一重锁，不会因为指令重排序而返回错误的单例实例
    private static volatile Singleton instance;

    private String value;

    // 私有化构造器
    private Singleton(String value) {
        // 加一个判断 看能否防止反射
        if (instance!=null){
            throw new RuntimeException("不允许初始化多个实例");
        }
        this.value = value;
    }

    // 提供公有获取实例的方法
    public static Singleton getInstance(String var) {
        // 双重检查的第一重是为了避免所有的线程串行化，提高性能
        if (instance == null) {
            // 加锁是为了保证避免多线程竞争，创建多个实例
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(var);
                }
                return instance;
            }
        }
        return instance;
    }

    /**
    *  jdk的java.lang.runTime就是一个单例模式,不过其采用的是饿汉式，如果一直不用会导致内存浪费
    */
}
