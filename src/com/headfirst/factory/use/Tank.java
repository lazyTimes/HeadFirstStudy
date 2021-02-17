package com.headfirst.factory.use;

import com.headfirst.factory.abstractfac.Cannon;

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

    private Cannon cannon;

    /**
     * 移动的方法s
     */
    public abstract void move();

    /**
     * 攻击
     */
    public abstract void attack();

    /**
     * 停止
     */
    public abstract void stop();

    public Cannon getCannon() {
        return cannon;
    }

    public void setCannon(Cannon cannon) {
        this.cannon = cannon;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "hp=" + hp +
                ", bullet=" + bullet +
                ", cannon=" + cannon +
                '}';
    }
}
