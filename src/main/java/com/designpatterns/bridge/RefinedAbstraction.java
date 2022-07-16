package com.designpatterns.bridge;

public class RefinedAbstraction extends Abstraction{
    private Implementor implementor;
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
        this.implementor = implementor;
    }

    public void Operation() {
        implementor.OperationImpl();
        System.out.println("扩展抽象化角色被访问");
    }
}
