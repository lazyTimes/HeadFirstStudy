package com.headfirst.decoration.non;

/**
 * 柠檬汁
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:53
 */
public class LeamonJuice {

    private String name;

    private double price;


    public LeamonJuice(String name, double price) {
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
