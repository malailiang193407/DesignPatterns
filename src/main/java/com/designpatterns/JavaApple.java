package com.designpatterns;

public class JavaApple implements IFruit{

    private Integer id;
    private String name;
    private Double price;

    public JavaApple(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Double getPrice() {
        return this.price;
    }
}
