package com.headfirst.strategy.strategyfactory;

import com.headfirst.strategy.CaveatStrategy;
import com.headfirst.strategy.use.BlackListStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略和工厂结合
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 23:49
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("limit", "1000");
        objectObjectHashMap.put("count", "2000");
        objectObjectHashMap.put("divisor", "1");
        objectObjectHashMap.put("dividend", "0");
        objectObjectHashMap.put("flag", true);
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.doStrategy("quantity", objectObjectHashMap);
        strategyContext.doStrategy("noresult", objectObjectHashMap);
        strategyContext.doStrategy("blacklist", objectObjectHashMap);
    }/*
    警告，当前数据内容无法获取返回值
    触犯黑名单列表，但不警告
    */
}
