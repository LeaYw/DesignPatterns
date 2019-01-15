package com.leayw.patterns.structure.decorator;

public class SportCar extends CarDecorator {

    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("sport car feature");
    }
}
