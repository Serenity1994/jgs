package com.jgs.designpattern.structural.bridge_pattern.raw;

public class Square extends Shape {
    @Override
    public void draw() {
        color.bepaint("square");
    }
}
