package com.headfirst.version3;

/**
 * 实现鸭子不会飞的动作
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 13:49
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("不支持飞行");
    }
}
