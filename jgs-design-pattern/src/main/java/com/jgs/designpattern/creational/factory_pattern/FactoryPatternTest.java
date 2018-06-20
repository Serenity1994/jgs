package com.jgs.designpattern.creational.factory_pattern;

import com.jgs.designpattern.creational.factory_pattern.raw.Shape;
import com.jgs.designpattern.creational.factory_pattern.raw.ShapeFactory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        rectangle.draw();
        square.draw();
    }
}
