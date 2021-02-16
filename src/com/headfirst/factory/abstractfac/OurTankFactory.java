package com.headfirst.factory.abstractfac;


import com.headfirst.factory.use.MyTank;

/**
 * 我方坦克的创建工厂
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 14:28
 */
public class OurTankFactory implements TankFactory {
    @Override
    public MyTank createTank() {
        return new MyTank();
    }
}
