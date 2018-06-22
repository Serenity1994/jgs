package com.jgs.designpattern.structural.bridge_pattern;

import com.jgs.designpattern.structural.bridge_pattern.raw.Color;
import com.jgs.designpattern.structural.bridge_pattern.raw.Square;
import com.jgs.designpattern.structural.bridge_pattern.raw.White;
import org.junit.Test;

public class BridgePatternTest {
    @Test
    public void test(){
        Color white = new White();
        Square square = new Square();
        square.setColor(white);
        square.draw();
    }
}
