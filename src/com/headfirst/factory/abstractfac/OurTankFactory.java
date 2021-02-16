package com.headfirst.factory.abstractfac;


import com.headfirst.factory.use.MyTank;
import com.headfirst.factory.use.Tank;

/**
 * 我方坦克的创建工厂
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 14:28
 */
public class OurTankFactory implements TankFactory {

    /**
     * 创建自带大炮的坦克
     * @return
     */
    public Tank createTanAndCannon() {
        Tank myTank = createTank();
        myTank.setCannon(createCannon());
        return myTank;
    }

    @Override
    public Tank createTank() {
        return new MyTank();
    }

    @Override
    public Cannon createCannon() {
        return new Artillery();
    }
}
