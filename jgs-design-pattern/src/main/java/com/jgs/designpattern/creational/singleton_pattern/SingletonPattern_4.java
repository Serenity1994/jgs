package com.jgs.designpattern.creational.singleton_pattern;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 枚举
 * 使用SingletonPattern_4.INSTANCE即可获得SingletonPattern_4的实例
 *  * 使用更简单
 *  * 在序列化和反序列化时还是保持单例
 *
 */
public enum  SingletonPattern_4 {
    INSTANCE;
    static {
        System.out.println("static...");
    }

    {
        System.out.println("class block");
    }
    private SingletonPattern_4(){
        System.out.println("init...");
    }

    public void run(){
        System.out.println("run...");
    }
}
