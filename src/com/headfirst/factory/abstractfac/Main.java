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
        Cannon cannon = ourTankFactory.createCannon();
        Tank mouseTankFactoryTank = mouseTankFactory.createTank();
        Cannon cannon1 = mouseTankFactory.createCannon();
        ourTankFactoryTank.setCannon(cannon);
        mouseTankFactoryTank.setCannon(cannon1);
        System.err.println("our = " + ourTankFactoryTank);
        System.err.println("mouse = " + mouseTankFactoryTank);
    }/*
        our = Tank{hp=1, bullet=[java.lang.Object@677327b6, java.lang.Object@14ae5a5, java.lang.Object@7f31245a],
        cannon=com.headfirst.factory.abstractfac.Artillery@6d6f6e28}
        老鼠坦克移动
        mouse = Tank{hp=1, bullet=[java.lang.Object@135fbaa4, java.lang.Object@45ee12a7, java.lang.Object@330bedb4, java.lang.Object@2503dbd3, java.lang.Object@4b67cf4d],
        cannon=com.headfirst.factory.abstractfac.RocketLauncher@7ea987ac}
        老鼠坦克开枪

     */
}
