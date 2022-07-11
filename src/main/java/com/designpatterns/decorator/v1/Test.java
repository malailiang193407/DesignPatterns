package com.designpatterns.decorator.v1;

/**
 * 装饰者模式
 *
 * 允许向一个现有的类添加功能，同时又不改变其结构，他是作为一个现有类的包装
 * 数据结构性
 */
public class Test {
    public static void main(String[] args) {
        JianBin jiaJiDan = new JiaJiDan();
        System.out.println(jiaJiDan.getDes()+":"+ jiaJiDan.getJG());
    }
}
