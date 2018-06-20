package com.jgs.designpattern.creational.abstract_factory_pattern.raw;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
