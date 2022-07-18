package com.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PeopleProxy implements InvocationHandler {
    // 目标对象
    private Object target;

    public PeopleProxy(Object target) {
        this.target = target;
    }

    // 代理对象
    public Object  getBind(){
        Class  cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 前
        beforeMethod();
        Object result =  method.invoke(target,args);
        // 后
        afterMethod();
        return  result;
    }
    public void beforeMethod() {
        System.out.println("代理前执行的方法");
    }
    public void afterMethod() {
        System.out.println("代理后执行的方法");
    }
}
