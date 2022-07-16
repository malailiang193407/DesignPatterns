package com.designpatterns.adapter.objectadapter;

public class JtTarget implements Target {
    @Override
    public void request() {
        System.out.println("具体实现者");
    }
}
