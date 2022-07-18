package com.designpatterns.proxy;

/**
 * 动态代理模式
 * jdk动态代理
 * 实现InvocationHandler接口
 * 使用 Proxy.newProxyInstance 产生代理对象；
 * 被代理的对象必须要实现接口；
 * 内部采用asm技术动态生成字节码；
 *
 */
public class Test {
    public static void main(String[] args) {

        Eat eat = (Eat) new PeopleProxy(new EatImpl()).getBind();
        eat.eat();
    }
}
