package com.headfirst.factory.method;


import com.headfirst.factory.use.MouseTank;
import com.headfirst.factory.use.Tank;

import java.util.Objects;

/**
 * 敌人坦克的构建工厂
 * 老鼠坦克
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 14:28
 */
public class MouseTankFactory extends TankFactory {

    @Override
    protected Tank createConcreteTankMethod(String check) {
        Tank tank = null;
        if(Objects.equals(check, "mouse")){
            tank = new MouseTank();
        }
        return tank;
    }
}
