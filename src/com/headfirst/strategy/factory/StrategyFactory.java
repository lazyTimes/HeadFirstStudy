package com.headfirst.strategy.factory;

import com.headfirst.strategy.CaveatStrategy;
import com.headfirst.strategy.use.BlackListStrategy;
import com.headfirst.strategy.use.NoResultStrategy;
import com.headfirst.strategy.use.QuantityStrategy;

import java.util.Map;
import java.util.Objects;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.strategy.factory
 * @Description : 策略工厂，根据参数生产对应的策略条件
 * @Create on : 2021/1/27 13:24
 **/
public class StrategyFactory {

    /**
     * 创建策略
     * @param service
     * @return
     */
    public CaveatStrategy createStrategy(String service){
        // 数量监控
        if(Objects.equals(service, "quantity")){
            return new QuantityStrategy();
        }else if(Objects.equals(service, "noresult")){
            // 没有返回值
            return new NoResultStrategy();
        }else if(Objects.equals(service, "blacklist")){
            // 黑名单
            return new BlackListStrategy();
        }
        return null;
    }
}
