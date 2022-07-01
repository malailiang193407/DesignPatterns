package com.designpatterns;

import java.math.BigDecimal;

/**
 * 1、先将对应的苹果的id、名称、价格打印出来
 * 2、搞活动促销苹果价格打折0.8
 */
public class Test {
    public static void main(String[] args) {
        // 1、先将对应的苹果的id、名称、价格打印出来
       IFruit fruit =  new JavaApple(1,"苹果",304d);
        System.out.println("水果id:"+fruit.getId()+"水果价格:"+ fruit.getPrice()+"水果名称:"+fruit.getName());
        // 2、搞活动促销苹果价格打折0.8
        IFruit ifruit =new JavaDiscountApple(1,"苹果",304d);
        JavaDiscountApple javaDiscountApple = (JavaDiscountApple)ifruit;
        Double price = new BigDecimal(javaDiscountApple.getPrice()+"").doubleValue();
        System.out.println(price+":"+ javaDiscountApple.getId()+":"+ javaDiscountApple.getName());
    }
}
