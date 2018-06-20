package com.jgs.designpattern.creational.singleton_pattern;

/**
 * 懒汉式
 * 双重校验锁
 */
public class SingletonPattern_2 {
    private volatile static SingletonPattern_2 instance;

    private SingletonPattern_2() {
    }

    public static SingletonPattern_2 getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern_2.class) {
                if (instance == null) {
                    instance = new SingletonPattern_2();
                }
            }
        }
        return instance;
    }
}
