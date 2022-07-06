package com.designpatterns.shapefactory;

public class Circular implements Shape{
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
