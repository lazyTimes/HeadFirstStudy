package com.headfirst.version3;

/**
 * 橡皮鸭子的叫声等
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 13:51
 */
public class Squeak implements QuackBehavior{


    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
