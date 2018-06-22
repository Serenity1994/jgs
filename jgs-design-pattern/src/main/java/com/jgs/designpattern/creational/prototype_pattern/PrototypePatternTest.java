package com.jgs.designpattern.creational.prototype_pattern;

import com.jgs.designpattern.creational.prototype_pattern.raw.Shape;
import com.jgs.designpattern.creational.prototype_pattern.raw.ShapeCache;
import org.junit.Test;

public class PrototypePatternTest {
    @Test
    public void test(){
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape:" + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape:" + clonedShape2.getType());
    }
}
