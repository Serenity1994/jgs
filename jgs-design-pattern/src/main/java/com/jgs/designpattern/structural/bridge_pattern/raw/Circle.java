package com.jgs.designpattern.structural.bridge_pattern.raw;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("Circle");
    }
}
