package com.leayw.patterns.behavior.template_method;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildPillars() {
        System.out.println("build wooden pillars");

    }

    @Override
    public void buildWalls() {
        System.out.println("build wooden walls");
    }
}
