package com.headfirst.chain.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.chain
 * @Description : 责任链的集合
 * @Create on : 2021/10/22 13:51
 **/
public class RequestChain {

    private int index;

    private Request[] requestList;

    public RequestChain(int index) {
        this.index = 0;
        this.requestList = new Request[index];
    }

    public void addRequest(Request request) {
        if (index >= requestList.length) {
            throw new UnsupportedOperationException("已满，无法继续添加");
        }
        requestList[index++] = request;
    }

    public boolean process(int val1, int val2) {
        int result = 0;
        for (Request req : requestList) {
            try {
                result += req.process(val1, val2);
            } catch (Exception e) {
                System.out.printf("第%s处理失败,处理失败为%s%n", index, req);
                return false;
            }

        }
        System.out.printf("处理结果:%s\n", result);
        return true;
    }

}
