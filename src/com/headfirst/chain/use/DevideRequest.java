package com.headfirst.chain.use;

import java.math.BigDecimal;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.chain.use
 * @Description : 除法处理
 * @Create on : 2021/10/22 14:25
 **/
public class DevideRequest implements Request{
    @Override
    public int process(int val1, int val2) {
        if(0 == val2){
            throw new IllegalArgumentException("除数不能为0");
        }
        return new BigDecimal(val1).divide(new BigDecimal(val2)).intValue();
    }
}
