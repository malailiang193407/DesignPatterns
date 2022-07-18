package com.designpatterns.proxy;

public class EatImpl implements Eat{
    @Override
    public void eat() {
        System.out.println("人吃饭");
    }
}
