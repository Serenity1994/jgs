package com.jgs.designpattern.creational.singleton_pattern;

import org.junit.Test;

public class SingletonPatternTest {
    @Test
    public void test() {
        SingletonPattern_4 instance = SingletonPattern_4.INSTANCE;
    }

    @Test
    public void test1() {
//        SingletonPattern_1 instance = SingletonPattern_1.getInstance();
//        instance.run();
//        SingletonPattern_1 instance1 = SingletonPattern_1.getInstance();
//        instance1.run();
//        System.out.println(instance == instance1);
    }

    @Test
    public void testEnum() {
        SingletonPattern_4 instance1 = SingletonPattern_4.INSTANCE;
        instance1.run();
        SingletonPattern_4 instance2 = SingletonPattern_4.INSTANCE;
        instance2.run();
        System.out.println(instance1 == instance2);//true
    }

    @Test
    public void test11(){
        TestClassLoader testClassLoader = new TestClassLoader();
        testClassLoader.run();
        TestClassLoader testClassLoader1 = new TestClassLoader();
        testClassLoader1.run();
    }
}

