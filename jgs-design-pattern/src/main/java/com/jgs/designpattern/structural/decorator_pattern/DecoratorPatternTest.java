package com.jgs.designpattern.structural.decorator_pattern;

import com.jgs.designpattern.structural.decorator_pattern.raw.Circle;
import com.jgs.designpattern.structural.decorator_pattern.raw.Rectangle;
import com.jgs.designpattern.structural.decorator_pattern.raw.RedShapeDecorator;
import com.jgs.designpattern.structural.decorator_pattern.raw.Shape;
import org.junit.Test;

public class DecoratorPatternTest {
    @Test
    public void test() {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
