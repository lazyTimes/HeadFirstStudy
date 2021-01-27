package com.headfirst.decoration.use;

/**
 * TODO
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:12
 */
public class Main {

    public static void main(String[] args) {
        Coffe coffe = new Coffe();
        Milk milk = new Milk(coffe);
        Cocnut cocnut = new Cocnut(milk);
        cocnut.decoration();

    }
}
