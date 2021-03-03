package com.headfirst.adapter.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.adapter.use
 * @Description : 插口适配器，让英国的插口可以适配
 * @Create on : 2021/3/3 10:11
 **/
public class Adapter implements Mouth {

    private EngMouth engMouth;

    public Adapter(EngMouth engMouth) {
        this.engMouth = engMouth;
    }

    @Override
    public void jack() {
        engMouth.specialJack();
    }
}
