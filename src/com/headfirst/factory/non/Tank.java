package com.headfirst.factory.non;

import java.util.List;

/**
 * 坦克的抽象类，定义坦克的行为
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 0:14
 */
public abstract class Tank {


    /**
     * 坦克hp
     */
    protected int hp;

    /**
     * 坦克子弹
     */
    protected List<Object> bullet;

    /**
     * 移动的方法s
     */
    abstract void move();

    /**
     * 攻击
     */
    abstract void attack();

    /**
     * 停止
     */
    abstract void stop();
}
