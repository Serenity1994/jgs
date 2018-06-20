package com.jgs.designpattern.creational.singleton_pattern;

/**
 * 饿汉式
 */
public class SingletonPattern_1 {
    private static SingletonPattern_1 instance = new SingletonPattern_1();

    public static SingletonPattern_1 getInstance() {
        System.out.println("get instance...");
        return instance;
    }

    static {
        System.out.println("static");
    }

    {
        System.out.println("class block");
    }

    private SingletonPattern_1() {
        System.out.println("init...");
    }

    public void run() {
        System.out.println("run...");
    }

    public static void main(String[] args) {
        SingletonPattern_1 instance = SingletonPattern_1.getInstance();
        instance.run();
        SingletonPattern_1 instance1 = SingletonPattern_1.getInstance();
        instance1.run();
        System.out.println(instance == instance1);
    }

}
