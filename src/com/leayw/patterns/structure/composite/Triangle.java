package com.leayw.patterns.structure.composite;

public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Tirangle with color " + fillColor);
    }
}
