package com.designpatterns.shapefactory;

/**
 * 工厂模式
 * 创建性模式，提供了一种常见对象的最佳方式
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("Rectangle");
        shape.draw();
    }
}
