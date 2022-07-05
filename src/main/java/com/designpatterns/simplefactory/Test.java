package com.designpatterns.simplefactory;

/**
 * 简单的工厂模式
 *
 * 假设有一个课程工厂，想生产不同的课程，所以就需要用一个单独的类来专门生产课程。
 */
public class Test {
    public static void main(String[] args) {
        AbCourse abCourse = CourseFactory.creatCourseFactory("java");
        abCourse.study();
    }
}
