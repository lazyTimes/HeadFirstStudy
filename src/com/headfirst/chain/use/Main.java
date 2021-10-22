package com.headfirst.chain.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.chain.use
 * @Description : 责任链单元测试
 * @Create on : 2021/10/22 14:27
 **/
public class Main {

    public static void main(String[] args) {
        RequestChain requestChain = new RequestChain(3);
        requestChain.addRequest(new AddRequest());
        requestChain.addRequest(new SubstractRequest());
        requestChain.addRequest(new DevideRequest());
        requestChain.process(15, 6);

    }
}
