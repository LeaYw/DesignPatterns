package com.leayw.patterns.create.factory;

public class ComputorFactory {
    public static Computer getComputor(String type, String ram, String hdd, String cpu) {
        switch (type) {
            case "PC":
                return new PC(ram, hdd, cpu);
            case "server":
                return new Server(ram, hdd, cpu);
            default:
                return null;
        }
    }
}
