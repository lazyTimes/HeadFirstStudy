package com.headfirst.version3;

/**
 * 重构之后的方法
 * 1. 我们通过父类的构造器进行初始化，为父类的行为构建自己想要的行为
 * 2. 子类虽然可以继承父类的行为并且自由的组合叫和飞行的结果，该结果抽取到单独的类进行
 *
 * 问题：
 * 1. 我们需要自己进行构造器的指定，同时依赖构造器很不直观，还是属于面向实现编程
 *
 * 想一下：
 * 要怎么样在运行的时候改变鸭子的行为。
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 14:08
 */
public class MallardDuck extends Duck {

    @Override
    public void performanQuack() {
        quackBehavior = new Quack();
        super.performanQuack();
    }

    @Override
    public void performanFly(){
        flyBehavior = new FlyWithWings();
       super.performanFly();
    }

    public void display(){
        System.out.println("样子");
    }
}
