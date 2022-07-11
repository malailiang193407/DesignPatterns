package com.designpatterns.decorator.v1;

public class JiaHuoTui extends JianBin{
    @Override
    protected String getDes() {
        return super.getDes()+"加火腿";
    }

    @Override
    protected Integer getJG() {
        return super.getJG()+2;
    }
}
