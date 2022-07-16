package com.designpatterns.adapter.objectadapter;

/**
 * 对象适配器、组合方式
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
