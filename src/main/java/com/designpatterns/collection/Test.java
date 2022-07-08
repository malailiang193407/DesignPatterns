package com.designpatterns.collection;

import com.designpatterns.JavaApple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        ArrayList<JavaApple> list = new ArrayList<JavaApple>();

        list.add(new JavaApple(2,"false",2d));
        list.add(new JavaApple(5,"true",1d));
        list.add(new JavaApple(3,"false",3d));
        list.add(new JavaApple(1,"true",1d));
        System.out.println("排序前"+list);
        Collections.sort(list, new Comparator<JavaApple>() {
            @Override
            public int compare(JavaApple o1, JavaApple o2) {
                boolean onLine1 = Boolean.valueOf(o1.getName());
                boolean onLine2 =  Boolean.valueOf(o2.getName());
                //两个值进行位运算,值不同为1,为true,参与运算
                //值相同为0,为false,不参与运算
                if (onLine1 ^ onLine2) {
                    return onLine1 ? -1 : 1;
                } else {
                }
                    return 0;
                }

        });
        System.out.println("排序后"+list);
    }
}
