package com.jgs.designpattern.structural.decorator_pattern.raw;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: red");
    }
}
