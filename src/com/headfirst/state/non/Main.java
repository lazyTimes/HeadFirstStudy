package com.headfirst.state.non;

/**
 * 单元测试
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        CandyMechanica candyMechanica = new CandyMechanica(5);
        candyMechanica.putCoin();

        candyMechanica.startUp();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
    }
}
