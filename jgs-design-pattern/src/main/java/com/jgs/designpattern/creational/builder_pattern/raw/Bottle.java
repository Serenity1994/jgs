package com.jgs.designpattern.creational.builder_pattern.raw;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
