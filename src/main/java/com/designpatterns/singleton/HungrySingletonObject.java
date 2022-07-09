package com.designpatterns.singleton;

/**
 * 饿汉式
 */
public class HungrySingletonObject {
    private final static HungrySingletonObject hungrySingletonObject;
    static {
        hungrySingletonObject = new HungrySingletonObject();
    }
    public static HungrySingletonObject getInstance() {
        return hungrySingletonObject;
    }
}
