package com.jgs.designpattern.structural.bridge_pattern.raw;

public class Red implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("red " + shape);
    }
}
