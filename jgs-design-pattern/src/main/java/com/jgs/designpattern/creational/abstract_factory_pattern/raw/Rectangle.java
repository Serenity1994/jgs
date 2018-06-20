package com.jgs.designpattern.creational.abstract_factory_pattern.raw;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
