package com.designpatterns.builder;

/**
 * 抽象建造者
 */
public interface AbstractBuilder {
    Order order = new Order();
    void buildOrderPrice();
    void buildOrderName();
    void buildOrderId();
    void buildOrderAdress();
    void buildOrderTime();
    default Order buildOrder() {
        return order;
    }
}
