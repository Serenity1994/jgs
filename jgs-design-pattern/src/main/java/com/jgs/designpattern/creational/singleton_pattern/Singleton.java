package com.jgs.designpattern.creational.singleton_pattern;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){
        System.out.println("constructor");
    }
    {
        System.out.println("none static block");
    }
    static {
        System.out.println("static block");
    }
    public static Singleton getInstance(){
        return instance;
    }
    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.run();
        Singleton instance1 = Singleton.getInstance();
        instance1.run();
    }
}
