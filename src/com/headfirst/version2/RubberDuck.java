package com.headfirst.version2;

/**
 * 橡皮鸭子
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 12:15
 */
public class RubberDuck extends Duck {
    public void swin(){
        System.out.println("游泳");
    }

    public void display(){
        System.out.println("绿色");
    }

    // ==>== 由于没有实现flay的接口，所以橡皮鸭不会飞

    public void quack(){
        System.err.println("橡皮鸭子叫声不一样");
    }
}
