package com.designpatterns.adapter.classadapter;

/**
 * 适配者
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.requestAdaptee();
    }
}
