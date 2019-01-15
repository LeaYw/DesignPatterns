package com.leayw.patterns.structure.facade;

public class FacadePatternTest {

    public static void main(String[] args) {
        String property = ModelHelper.getModelProperty(ModelType.MODEL1);

        System.out.println(property);

        String property2 = ModelHelper.getModelProperty(ModelType.MODEL2);

        System.out.println(property2);
    }
}
