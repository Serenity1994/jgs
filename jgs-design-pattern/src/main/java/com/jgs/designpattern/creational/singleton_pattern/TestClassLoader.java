package com.jgs.designpattern.creational.singleton_pattern;

public class TestClassLoader {

    public TestClassLoader(){
        System.out.println("constructor");
    }

    public void run(){
        System.out.println("run");
    }

    {
        System.out.println("none static block");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        TestClassLoader testClassLoader = new TestClassLoader();
        testClassLoader.run();
        TestClassLoader testClassLoader1 = new TestClassLoader();
        testClassLoader1.run();
    }
}
