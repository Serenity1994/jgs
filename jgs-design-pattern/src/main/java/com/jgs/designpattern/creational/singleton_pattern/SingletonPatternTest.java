package com.jgs.designpattern.creational.singleton_pattern;

import org.junit.Test;

import java.io.*;

public class SingletonPatternTest {
    @Test
    public void test() {
        File file = new File("singleton");
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            SingletonPattern_1 instance = SingletonPattern_1.getInstance();
            oos.writeObject(instance);
            oos.close();
            ois = new ObjectInputStream(new FileInputStream(file));
            SingletonPattern_1 instance1 = (SingletonPattern_1)ois.readObject();
            System.out.println(instance == instance1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        File file = new File("singleton");
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            SingletonPattern_4 instance = SingletonPattern_4.INSTANCE;
            oos.writeObject(instance);
            oos.close();
            ois = new ObjectInputStream(new FileInputStream(file));
            SingletonPattern_4 instance1 = (SingletonPattern_4)ois.readObject();
            System.out.println(instance == instance1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

