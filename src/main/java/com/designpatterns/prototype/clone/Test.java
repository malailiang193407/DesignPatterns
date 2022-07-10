package com.designpatterns.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //测试clone方法
        Date date = new Date(0L);
        Pig pig1 = new Pig("佩奇",date);
        Pig pig2 = (Pig)pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        pig1.getBirthday().setTime(999999999999L);
        pig1.setName("乔治");
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
