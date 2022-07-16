package com.designpatterns.bridge;

/**
 * 乔接模式
 * 用于抽象换和实现化解藕，使这两者都可以变化，属于结构性模式
 * 通过抽象化和实现化之间的桥梁结构，来实现二者的解藕
 *
 * 抽象化 要有实现化的对象引用
 * 实现化
 * 扩展抽象化
 * 具体实现化
 */
public class Test {
    public static void main(String[] args) {
        Implementor implementor =  new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.Operation();
    }
}
