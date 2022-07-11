package com.designpatterns.decorator.v2;

public class JtJianBin extends AJianBin{
    @Override
    protected String getDes() {
        return "煎饼";
    }

    @Override
    protected Integer getJG() {
        return 5;
    }
}
