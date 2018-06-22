package com.jgs.designpattern.creational.prototype_pattern.raw;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
