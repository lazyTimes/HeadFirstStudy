package com.headfirst.adapter.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.adapter.use
 * @Description : 单元测试
 * @Create on : 2021/3/3 10:13
 **/
public class Main {

    public static void main(String[] args) {
        // 日版插口可以直接使用
        Mouth mouth = new JapanMouth();
        Switch aSwitch = new Switch(mouth);
        aSwitch.recharge();
        // 港版插口需要转接口
        Mouth mouth2 = new Adapter(new EngMouth());
        aSwitch.setMouth(mouth2);
        aSwitch.recharge();
    }/*运行结果：
    日版：开始充电
    港版：开始充电
    */
}
