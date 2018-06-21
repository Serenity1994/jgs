package com.jgs.designpattern.creational.singleton_pattern;

/**
 * 懒汉式
 * 双重校验锁
 */
public class SingletonPattern_2 {
    private volatile static SingletonPattern_2 instance;

    static {
        System.out.println("static");
    }

    private SingletonPattern_2() {
        System.out.println("constructor");
    }

    public static void test(){
        System.out.println("test");
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
