package com.headfirst.factory.abstractfac;

import java.util.List;

/**
 * 坦克的父类，定义坦克的行为
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
     *
     */
    protected Cannon cannon;

    /**
     * 移动的方法s
     */
    public abstract void move();

    /**
     * 攻击
     */
    abstract void attack();

    /**
     * 停止
     */
    abstract void stop();

    abstract void display();
}
