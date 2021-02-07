package com.headfirst.decoration.non;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:34
 */
public class Main {

    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea("原味奶茶", 5);
        Pearl pearl = new Pearl();
        Coconut coconut = new Coconut();
        pearl.plusAdditionVal(milkTea);
        coconut.plusAdditionVal(milkTea);
        milkTea.display();
    }
}
