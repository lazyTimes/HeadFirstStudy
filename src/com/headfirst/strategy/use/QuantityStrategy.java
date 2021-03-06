package com.headfirst.strategy.use;

import com.headfirst.strategy.CaveatStrategy;

import java.util.Map;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.strategy.use
 * @Description : 数量监控
 * @Create on : 2021/1/27 13:27
 **/
public class QuantityStrategy implements CaveatStrategy {
    @Override
    public void warning(Map<String, Object> params) {
        int limit = Integer.parseInt(params.get("limit").toString());
        int count = Integer.parseInt(params.get("count").toString());
        if(count > limit){
            System.err.println("警告，当前数据内容无法获取返回值");
        }
    }
}
