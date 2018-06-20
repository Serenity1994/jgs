package com.jgs.designpattern.creational.abstract_factory_pattern;

import com.jgs.designpattern.creational.abstract_factory_pattern.raw.*;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
