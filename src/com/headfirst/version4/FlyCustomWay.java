package com.headfirst.version4;

import com.headfirst.version3.FlyBehavior;

/**
 * 自定义的行为
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 14:48
 */
public class FlyCustomWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("带翅膀的飞行");
    }
}
