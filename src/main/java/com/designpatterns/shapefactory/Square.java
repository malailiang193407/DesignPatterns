package com.designpatterns.shapefactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
