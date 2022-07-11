package com.designpatterns.decorator.v1;

public class JiaJiDan extends JianBin{
    @Override
    protected String getDes() {
        return super.getDes()+"加鸡蛋";
    }

    @Override
    protected Integer getJG() {
        return super.getJG()+1;
    }
}
