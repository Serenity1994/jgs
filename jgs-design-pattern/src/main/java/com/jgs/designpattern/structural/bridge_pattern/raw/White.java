package com.jgs.designpattern.structural.bridge_pattern.raw;

public class White implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("white " + shape);
    }
}
