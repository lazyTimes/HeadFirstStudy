package com.headfirst.strategy.use;

import com.headfirst.strategy.CaveatStrategy;

import java.util.Map;

/**
 * 策略的上下文
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 22:52
 */
public class StrategyContext {

    private CaveatStrategy strategy;

    public StrategyContext(CaveatStrategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(Map<String, Object> params){
        strategy.warning(params);
    }
}
