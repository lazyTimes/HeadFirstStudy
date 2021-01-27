package com.headfirst.decoration.use;

/**
 * 咖啡接口
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:02
 */
public class Coffe implements DecorationDrink{

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void decoration() {
        System.out.println("我是咖啡");
    }
}
