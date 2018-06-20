package com.jgs.designpattern.creational.abstract_factory_pattern.raw;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
