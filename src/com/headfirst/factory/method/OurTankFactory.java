package com.headfirst.factory.method;


import com.headfirst.factory.use.MyTank;
import com.headfirst.factory.use.Tank;

import java.util.Objects;

/**
 * 我方坦克的创建工厂
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 14:28
 */
public class OurTankFactory extends TankFactory {

    @Override
    protected Tank createConcreteTankMethod(String check) {
        Tank tank = null;
        if(Objects.equals(check, "my")){
            tank = new MyTank();
        }
        return tank;
    }
}
