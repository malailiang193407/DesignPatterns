package com.designpatterns.singleton;

import java.io.Serializable;

public class SingletonObject implements Serializable {

    private volatile static SingletonObject singletonObject = null;

    // 将构造器私有，无法创建对象
    private SingletonObject() {
    }

    /**
     * 获取单利对象
     * @return
     */
    public static SingletonObject getInstance() {
        if (null == singletonObject) {
            // 设计到重排序 ，给对象分配内存、初始化对象,对象指定分配好的内存地址
            synchronized (SingletonObject.class) {
                if (null == singletonObject) {
                    singletonObject = new SingletonObject();
                }
            }
        }
        return singletonObject;
    }

    public Object readResolve(){
        System.out.println("调用了readResolve方法");
        return  singletonObject;
    }
}
