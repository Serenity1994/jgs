package com.jgs.designpattern.creational.singleton_pattern;

/**
 * 静态内部类
 */
public class SingletonPattern_3 {
    private static class InstanceHolder {
        private static SingletonPattern_3 instance = new SingletonPattern_3();
    }

    private SingletonPattern_3() {
    }

    public static SingletonPattern_3 getInstance() {
        return InstanceHolder.instance;
    }
}
