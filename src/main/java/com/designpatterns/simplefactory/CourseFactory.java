package com.designpatterns.simplefactory;

/**
 * 简单工厂模式
 */
public class CourseFactory {

    public static AbCourse creatCourseFactory(String name) {
        if ("java".equalsIgnoreCase(name)){
            return new JavaCourse();
        } else if ("Python".equalsIgnoreCase(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }
}
