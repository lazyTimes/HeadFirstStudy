package com.headfirst.factory.abstractfac;

import com.headfirst.factory.use.MouseTank;

/**
 * 敌人坦克的构建工厂
 * 老鼠坦克
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 14:28
 */
public class MouseTankFactory implements TankFactory {
    @Override
    public MouseTank createTank() {
        return new MouseTank();
    }
}
