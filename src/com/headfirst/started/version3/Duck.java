package com.headfirst.started.version3;

/**
 * 我们重写鸭子的方法
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 14:04
 */
public class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public Duck(){

    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }


    public void performanFly(){
        if(null == flyBehavior){
            throw new RuntimeException("当前鸭子不支持这种行为");
        }
        flyBehavior.fly();
    }

    public void performanQuack(){
        if(null == quackBehavior){
            throw new RuntimeException("当前鸭子不支持这种行为");
        }
        quackBehavior.quack();
    }
}
