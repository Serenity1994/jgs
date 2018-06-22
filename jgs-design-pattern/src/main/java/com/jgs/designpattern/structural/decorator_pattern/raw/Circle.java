package com.jgs.designpattern.structural.decorator_pattern.raw;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
