package com.leayw.patterns.behavior.template_method;

public class GlassHouse extends HouseTemplate {

    @Override
    public void buildPillars() {
        System.out.println("build glass pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("build glass walls");
    }
}
