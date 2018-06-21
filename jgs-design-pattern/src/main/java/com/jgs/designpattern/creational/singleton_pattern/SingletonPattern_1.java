package com.jgs.designpattern.creational.singleton_pattern;

import java.io.Serializable;

/**
 * 饿汉式
 */
public class SingletonPattern_1 implements Serializable {
    private static SingletonPattern_1 instance = new SingletonPattern_1();

    public static SingletonPattern_1 getInstance() {
        return instance;
    }

    // 不添加该方法则会出现 反序列化时出现多个实例的问题
    public Object readResolve() {
        return instance;
    }
}
