package com.designpatterns.singleton;

/**
 *
 * 单利模式
 * 测试对象两个线程操作，检查单利模式的是否线程安全
 *
 * */
public class Test {
    public static void main(String[] args) {
        T t = new T();
        Thread t1= new Thread(t);
        Thread t2= new Thread(t);
        t1.start();
        t2.start();
        System.out.println("main创建对象"+SingletonObject.getInstance());
    }
}
