package com.designpatterns.builder;

/**
 * 指挥者
 */
public class Director {
    AbstractBuilder abstractBuilder = null;

    /**
     * 通过构造器传入
     * @param abstractBuilder
     */
    public Director(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }
    /**
     * 通过setter传入
     */
    public void setAbstractBuilder(AbstractBuilder abstractBuilder) {
        this.abstractBuilder = abstractBuilder;
    }

    /**
     * 正常创建订单流程
     */
    public Order getOrder() {
        abstractBuilder.buildOrderAdress();
        abstractBuilder.buildOrderId();
        abstractBuilder.buildOrderPrice();
        abstractBuilder.buildOrderName();
        abstractBuilder.buildOrderTime();
        return  abstractBuilder.buildOrder();
    }
}
