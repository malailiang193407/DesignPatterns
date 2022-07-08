package com.designpatterns.builder;

public class AppleBulider implements AbstractBuilder{
    @Override
    public void buildOrderPrice() {
      order.setOrderPrice("苹果价格");
    }

    @Override
    public void buildOrderName() {
        order.setOrderName("商品是苹果");
    }

    @Override
    public void buildOrderId() {
        order.setOrderId("苹果Id");
    }

    @Override
    public void buildOrderAdress() {
        order.setOrderAdress("苹果订单地址");
    }
    @Override
    public void buildOrderTime() {
        order.setOrderTime("苹果订单产生时间");
    }
}
