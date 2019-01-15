package com.leayw.patterns.structure.facade;

public class ModelHelper {

    public static String getModelProperty(ModelType type) {
        switch (type) {
            case MODEL1:
                return new Model1().getProperty();
            case MODEL2:
                return new Model2().getProperty();
            default:
                return new Model2().getProperty();
        }
    }
}
