package com.headfirst.chain.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.chain.use
 * @Description : 减法处理
 * @Create on : 2021/10/22 14:24
 **/
public class SubstractRequest implements Request {
    @Override
    public int process(int val1, int val2) {
        return val1 - val2;
    }
}
