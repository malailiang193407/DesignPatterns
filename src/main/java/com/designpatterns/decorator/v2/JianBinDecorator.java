package com.designpatterns.decorator.v2;

/**
 * 抽象装饰类
 */
public abstract class JianBinDecorator extends AJianBin{
    private AJianBin aJianBin;

    public JianBinDecorator(AJianBin aJianBin) {
        this.aJianBin = aJianBin;
    }

    @Override
    protected String getDes() {
        return this.aJianBin.getDes();
    }

    @Override
    protected Integer getJG() {
        return this.aJianBin.getJG();
    }
}
