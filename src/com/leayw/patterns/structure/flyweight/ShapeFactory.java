package com.leayw.patterns.structure.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            switch (type) {
                case LINE:
                    shapeImpl = new Line();
                case OVAL_FILL:
                    shapeImpl = new Oval(true);
                case OVAL_NOFILL:
                    shapeImpl = new Oval(false);
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }
}
