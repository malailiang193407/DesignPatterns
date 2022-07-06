package com.designpatterns.shapefactory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画长方形");
    }
}
