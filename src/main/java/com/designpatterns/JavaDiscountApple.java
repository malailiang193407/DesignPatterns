package com.designpatterns;

public class JavaDiscountApple extends JavaApple{
    public JavaDiscountApple(Integer id, String name, Double price) {
        super(id, name, price);
    }
    /**
     * 原有价格
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }

    /**
     * 打折价格
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
