package com.leayw.patterns.behavior.template_method;

public class TemplateMethodPatternTest {

    public static void main(String[] args){
        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
