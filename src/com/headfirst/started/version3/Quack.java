package com.headfirst.started.version3;

/**
 * 鸭子叫的方法
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 13:50
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子叫");
    }
}
