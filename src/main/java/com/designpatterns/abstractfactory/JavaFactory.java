package com.designpatterns.abstractfactory;

/**
 * 具体工厂创建具体对象
 */
public class JavaFactory implements CourseFactory{
    @Override
    public Video getVide0() {
        return new JavaVideo();
    }
    @Override
    public Notes getNote() {
        return new JavaNote();
    }
}
