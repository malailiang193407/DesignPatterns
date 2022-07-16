package com.designpatterns.adapter.classadapter;

public class JtTarget implements Target{
    @Override
    public void request() {
        System.out.println("具体实现者");
    }
}
