package com.headfirst.adapter.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.adapter.use
 * @Description : 适配器模式
 * @Create on : 2021/3/3 10:06
 **/
public class Switch {

    private Mouth mouth;

    public Switch(Mouth mouth) {
        this.mouth = mouth;
    }

    /**
     * 模拟充电方法
     */
    public void recharge(){
        mouth.jack();
    }

    public Mouth getMouth() {
        return mouth;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }
}
