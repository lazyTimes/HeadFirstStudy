package com.headfirst.decoration.non;

/**
 * 奶茶实体类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:21
 */
public class MilkTea {

    private String name;

    private double price;


    public MilkTea(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void display() {
        System.out.println("name = "+ name + " price = " +price);
    }
}
