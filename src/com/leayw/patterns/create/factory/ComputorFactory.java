package com.leayw.patterns.create.factory;

/**
 * Factory Design Pattern Examples in JDK
 * java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * valueOf() method in wrapper classes like Boolean, Integer etc.
 */
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
