package com.headfirst.strategy.strategyfactory;

import com.headfirst.strategy.CaveatStrategy;

import java.util.Map;

/**
 * 改写策略的上下文
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 22:52
 */
public class StrategyContext {

    private CaveatStrategyFactory caveatStrategyFactory = new CaveatStrategyFactory();

    public void doStrategy(String service, Map<String, Object> params){
        caveatStrategyFactory.createStrategy(service).warning(params);
    }
}
