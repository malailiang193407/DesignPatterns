package com.designpatterns.decorator.v2;

public class JtJianBinDecorator extends JianBinDecorator{

    public JtJianBinDecorator(AJianBin aJianBin) {
        super(aJianBin);
    }

    @Override
    protected String getDes() {
        return super.getDes()+"加一个香肠";
    }

    @Override
    protected Integer getJG() {
        return super.getJG()+1;
    }




}
