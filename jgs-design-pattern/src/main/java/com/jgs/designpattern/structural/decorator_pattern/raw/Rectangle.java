package com.jgs.designpattern.structural.decorator_pattern.raw;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangles");
    }
}
