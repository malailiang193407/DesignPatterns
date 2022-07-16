package com.designpatterns.adapter.classadapter;

/**
 * 类适配器原则、继承
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
