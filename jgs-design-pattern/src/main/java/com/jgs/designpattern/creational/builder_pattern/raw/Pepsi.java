package com.jgs.designpattern.creational.builder_pattern.raw;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 16.0f;
    }
}
