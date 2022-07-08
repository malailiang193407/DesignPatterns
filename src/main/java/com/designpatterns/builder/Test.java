package com.designpatterns.builder;

/**
 * 建造者模式-创建性
 * 类复杂，属性多 可以考虑使用建造者模式
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以常见不同的表示
 *
 * 抽象建造者、具体建造者、指挥者、
 */
public class Test {
    public static void main(String[] args) {
        //建造者对象
        AbstractBuilder abstractBuilder =  new AppleBulider();
        // 指挥者
        Director director = new Director(abstractBuilder);
        System.out.println(director.getOrder());
    }
}
