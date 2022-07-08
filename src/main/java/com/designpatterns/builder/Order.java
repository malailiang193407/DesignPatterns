package com.designpatterns.builder;

/**
 * 订单实体
 */
public class Order {

    private String orderPrice;

    private String orderName;

    private String orderId;

    private String orderAdress;

    private String orderTime;

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderAdress() {
        return orderAdress;
    }

    public void setOrderAdress(String orderAdress) {
        this.orderAdress = orderAdress;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderPrice='" + orderPrice + '\'' +
                ", orderName='" + orderName + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderAdress='" + orderAdress + '\'' +
                ", orderTime='" + orderTime + '\'' +
                '}';
    }
}
