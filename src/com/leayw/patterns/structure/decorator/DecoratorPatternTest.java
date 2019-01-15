package com.leayw.patterns.structure.decorator;

public class DecoratorPatternTest {


    public static void main(String[] args) {
        Car sportCar = new SportCar(new BasicCar());

        sportCar.assemble();

        Car luxurySportCar = new LuxuryCar(new SportCar(new BasicCar()));
        luxurySportCar.assemble();
    }
}
