package com.leayw.patterns.structure.bridge;

public class BridgePatternTest {



    public static void main(String[] args){
        Shape rectangle = new Rectangle(new RedColor());
        rectangle.applyColor();

        Shape oval = new Oval(new BlackColor());
        oval.applyColor();
    }
}
