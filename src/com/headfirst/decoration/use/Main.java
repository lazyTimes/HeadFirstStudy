package com.headfirst.decoration.use;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:12
 */
public class Main {

    public static void main(String[] args) {
//        run1();
        run2();

    }

    private static void run2(){
        DrinkAbstract drinkAbstract = new MilkTea("原味奶茶", 5);
        Pearl codiment = new Pearl(drinkAbstract);
        codiment.plusAdditionVal();

    }

    private static void run1(){
        Coffe coffe = new Coffe();
        Milk milk = new Milk(coffe);
        Cocnut cocnut = new Cocnut(milk);
        cocnut.decoration();
    }
}
