package com.headfirst.started.version2;

/**
 * 绿头鸭子
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 12:13
 */
public class MallardDuck extends Duck implements FlyAble{
    public void swin(){
        System.out.println("游泳");
    }

    public void display(){
        System.out.println("绿色");
    }

    public void fly(){
        System.out.println("飞行");
    }
}
