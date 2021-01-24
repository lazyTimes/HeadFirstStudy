package com.headfirst.started.version3;

/**
 * 不出声
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 13:52
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        throw new UnsupportedOperationException("不会叫");
    }
}
