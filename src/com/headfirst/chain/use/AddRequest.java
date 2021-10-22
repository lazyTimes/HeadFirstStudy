package com.headfirst.chain.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.chain
 * @Description : 加法请求处理
 * @Create on : 2021/10/22 13:51
 **/
public class AddRequest implements Request{


    @Override
    public int process(int val1, int val2) {
        return val1 + val2;
    }
}
