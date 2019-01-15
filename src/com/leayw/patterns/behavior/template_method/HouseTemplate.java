package com.leayw.patterns.behavior.template_method;

abstract public class HouseTemplate {

    public void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("house has been build");
    }

    public void buildFoundation() {
        System.out.println("build foundation");
    }

    abstract public void buildPillars();

    abstract public void buildWalls();

    public void buildWindows() {
        System.out.println("build windows");
    }
}
