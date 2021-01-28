package com.headfirst.strategy.factory;

import com.headfirst.strategy.CaveatStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 22:01
 */
public class Main {
    public static void main(String[] args) {
        // 模拟交易流转参数对象
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        StrategyFactory strategyFactory = new StrategyFactory();
        CaveatStrategy strategy = strategyFactory.createStrategy("quantity");

        // 表示除数和被除数
        objectObjectHashMap.put("limit", "1000");
        objectObjectHashMap.put("count", "2000");
        strategy.warning(objectObjectHashMap);

        strategy = strategyFactory.createStrategy("noresult");
        objectObjectHashMap.put("divisor", "1");
        objectObjectHashMap.put("dividend", "0");
        strategy.warning(objectObjectHashMap);

        strategy = strategyFactory.createStrategy("blacklist");
        objectObjectHashMap.put("flag", true);
        strategy.warning(objectObjectHashMap);
    }
}
