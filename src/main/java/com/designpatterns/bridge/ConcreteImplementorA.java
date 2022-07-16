package com.designpatterns.bridge;

//具体实现化角色
public class ConcreteImplementorA implements Implementor{
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化角色被访问（ConcreteImplementorA）");
    }
}
