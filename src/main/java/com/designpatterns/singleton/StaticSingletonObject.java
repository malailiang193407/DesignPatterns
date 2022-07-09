package com.designpatterns.singleton;

/**
 * 静态单利模式解决线程安全的问题
 */
public class StaticSingletonObject {

    /**
     * 获取class的对象🔒
     */
    public static class InnerClass {
        private static StaticSingletonObject singletonObject = new StaticSingletonObject();
    }
    private StaticSingletonObject() {
    }
    public StaticSingletonObject getInstance(){
        return InnerClass.singletonObject;
    }

}
