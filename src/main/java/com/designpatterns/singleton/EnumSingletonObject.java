package com.designpatterns.singleton;

/**
 * 枚举类型的单利模式
 */
public enum EnumSingletonObject {
    INSTANCE;
    public Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
