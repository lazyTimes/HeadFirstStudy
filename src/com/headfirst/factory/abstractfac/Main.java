package com.headfirst.factory.abstractfac;

import com.headfirst.factory.use.Tank;

/**
 * 单元测试
 * 抽象工厂
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 16:32
 */
public class Main {

    public static void main(String[] args) {
        TankFactory ourTankFactory = new OurTankFactory();
        TankFactory mouseTankFactory = new MouseTankFactory();
        Tank ourTankFactoryTank = ourTankFactory.createTank();
        Tank mouseTankFactoryTank = mouseTankFactory.createTank();
        System.err.println("our = " + ourTankFactory);
        System.err.println("mouse = " + mouseTankFactoryTank);
    }/*
        our = com.headfirst.factory.abstractfac.OurTankFactory@677327b6
        mouse = com.headfirst.factory.use.MouseTank@14ae5a5
        老鼠坦克移动
        老鼠坦克开枪
        老鼠坦克开枪
        停止
        老鼠坦克移动

     */
}
