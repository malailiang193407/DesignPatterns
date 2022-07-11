package com.designpatterns.decorator.v2;

/**
 * 抽象装饰类、具体装饰类
 */
public class Test {
    public static void main(String[] args) {
        AJianBin aJianBin = new JtJianBin();
        aJianBin = new EggJIanBinDecorator(aJianBin);
        aJianBin =new EggJIanBinDecorator(aJianBin);


        System.out.println(aJianBin.getDes()+" "+  aJianBin.getJG());
    }
}
