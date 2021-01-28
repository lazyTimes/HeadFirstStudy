package com.headfirst.strategy.use;

import com.headfirst.strategy.CaveatStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 22:53
 */
public class Main {

    /**
     * 使用策略模式
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("limit", "1000");
        objectObjectHashMap.put("count", "2000");
        objectObjectHashMap.put("divisor", "1");
        objectObjectHashMap.put("dividend", "0");
        objectObjectHashMap.put("flag", true);

        CaveatStrategy blackListStrategy = new BlackListStrategy();
        CaveatStrategy noResultStrategy = new NoResultStrategy();
        CaveatStrategy quantityStrategy = new QuantityStrategy();
        // 三种策略独立
        StrategyContext strategyContext = new StrategyContext(blackListStrategy);
        strategyContext.doStrategy(objectObjectHashMap);
        StrategyContext strategyContext2 = new StrategyContext(noResultStrategy);
        strategyContext2.doStrategy(objectObjectHashMap);
        StrategyContext strategyContext3 = new StrategyContext(quantityStrategy);
        strategyContext3.doStrategy(objectObjectHashMap);

        // 简化一下：
        StrategyContext strategyContext4 = new StrategyContext(blackListStrategy);
        strategyContext4.doStrategy(objectObjectHashMap);
        strategyContext4 = new StrategyContext(noResultStrategy);
        strategyContext4.doStrategy(objectObjectHashMap);
        strategyContext4 = new StrategyContext(quantityStrategy);
        strategyContext4.doStrategy(objectObjectHashMap);
    }/*
    触犯黑名单列表，但不警告
    警告，当前数据内容无法获取返回值
    触犯黑名单列表，但不警告
    警告，当前数据内容无法获取返回值
    */
}
