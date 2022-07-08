package com.designpatterns.abstractfactory;

/**
 * 抽象工厂默认 创建性
 * 方便扩展、适用于固定场景，不经常修改
 * 1、有产品族、产品等级的概念
 * 课程既有视频，手记同一个产品族
 *
 * 产品等级 类似于Python课程也有视频、手记
 */
public class Test {
    public static void main(String[] args) {
       CourseFactory factory = new JavaFactory();
       factory.getNote().getNote();
       factory.getVide0().getVideo();
    }
}
