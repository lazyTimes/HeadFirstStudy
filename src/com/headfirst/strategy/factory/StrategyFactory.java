package com.headfirst.strategy.factory;

import com.headfirst.strategy.CaveatStrategy;
import com.headfirst.strategy.use.QuantityStrategy;

import java.util.Map;
import java.util.Objects;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.strategy.factory
 * @Description : TODO
 * @Create on : 2021/1/27 13:24
 **/
public class StrategyFactory {

    /**
     * 创建策略
     * @param service
     * @return
     */
    public CaveatStrategy createStrategy(String service, Map<String, Object> params){
        if(Objects.equals(service, "quantity")){
            return new QuantityStrategy();
        }
    }
}
