package com.jgs.designpattern.creational.abstract_factory_pattern.raw;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
