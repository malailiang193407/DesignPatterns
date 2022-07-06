package com.designpatterns.shapefactory;

/**
 * 工厂
 */
public class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (null == shapeType) {
            return null;
        }
        if ("Rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        if ("Circular".equalsIgnoreCase(shapeType)) {
            return new Circular();
        }
        if ("Square".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
