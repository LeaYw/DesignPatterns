package com.leayw.patterns.create.abstracfactory;

import com.leayw.patterns.create.factory.Computer;

public class ComputorFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
