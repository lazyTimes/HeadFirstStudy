package com.headfirst.started.version4;

import com.headfirst.started.version3.FlyBehavior;
import com.headfirst.started.version3.QuackBehavior;

/**
 * 由于鸭子的行为是固定的，我们想要实现动态的鸭子行为
 * 此部分使用了version3的代码
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 14:25
 */
public class ActiveDuck{

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public ActiveDuck(){

    }

    public ActiveDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
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
