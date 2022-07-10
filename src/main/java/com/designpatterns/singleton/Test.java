package com.designpatterns.singleton;

import java.io.*;

/**
 *
 * 单利模式
 * 测试对象两个线程操作，检查单利模式的是否线程安全
 *
 * */
public class Test {
    public static void main(String[] args) throws Exception {
        SingletonObject singletonObject = SingletonObject.getInstance();
//        T t = new T();
//        Thread t1= new Thread(t);
//        Thread t2= new Thread(t);
//        t1.start();
//        t2.start();
//        System.out.println("main创建对象"+EnumSingletonObject.INSTANCE);
        FileOutputStream fos = new FileOutputStream("singleton_object");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(singletonObject);
        os.close();
        FileInputStream file = new FileInputStream(new File("singleton_object"));
        ObjectInputStream ois = new ObjectInputStream(file);
        SingletonObject newSingletonObject =(SingletonObject)ois.readObject();
        System.out.println(singletonObject);
        System.out.println(newSingletonObject);
        System.out.println(singletonObject == newSingletonObject);

    }
}
