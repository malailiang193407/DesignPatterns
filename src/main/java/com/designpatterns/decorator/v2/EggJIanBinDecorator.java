package com.designpatterns.decorator.v2;

public class EggJIanBinDecorator extends JtJianBinDecorator{

    public EggJIanBinDecorator(AJianBin jianBin) {
        super(jianBin);
    }

    @Override
    protected String getDes() {
        return super.getDes() +"加一个鸡蛋";
    }

    @Override
    protected Integer getJG() {
        return super.getJG()+1;
    }
}
