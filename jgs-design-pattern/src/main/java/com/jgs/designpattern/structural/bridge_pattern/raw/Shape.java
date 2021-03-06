package com.jgs.designpattern.structural.bridge_pattern.raw;

public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
