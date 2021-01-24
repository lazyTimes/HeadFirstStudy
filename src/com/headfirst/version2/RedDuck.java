package com.headfirst.version2;

/**
 * 红色鸭子
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 12:13
 */
public class RedDuck extends Duck implements FlyAble{
    public void swin(){
        System.out.println("游泳");
    }

    public void display(){
        System.out.println("红色");
    }

    public void fly(){
        System.out.println("飞行");
    }
}
