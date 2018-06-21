package com.jgs.designpattern.creational.singleton_pattern;

/**
 * 枚举
 * 使用SingletonPattern_4.INSTANCE即可获得SingletonPattern_4的实例
 * * 使用更简单
 * * 在序列化和反序列化时还是保持单例
 */
public enum SingletonPattern_4 {
    INSTANCE;

    public static void main(String[] args) {
        SingletonPattern_4 instance = SingletonPattern_4.INSTANCE;
        SingletonPattern_4 instance1 = SingletonPattern_4.INSTANCE;
        System.out.println(instance == instance1); //true
    }
}
