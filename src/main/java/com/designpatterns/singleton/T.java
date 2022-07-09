package com.designpatterns.singleton;

public class T implements Runnable{
    @Override
    public void run() {
        //创建对象
        SingletonObject singletonObject =SingletonObject.getInstance();
        System.out.println("线程名称:"+Thread.currentThread().getName()+"对象:"+singletonObject);
    }
}
