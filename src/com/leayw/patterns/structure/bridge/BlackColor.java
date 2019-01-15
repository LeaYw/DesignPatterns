package com.leayw.patterns.structure.bridge;

public class BlackColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("black");
    }
}
