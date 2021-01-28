package com.headfirst.strategy.strategyfactory;

import com.headfirst.strategy.CaveatStrategy;
import com.headfirst.strategy.use.BlackListStrategy;
import com.headfirst.strategy.use.NoResultStrategy;
import com.headfirst.strategy.use.QuantityStrategy;

import java.util.Map;
import java.util.Objects;

/**
 * 警告策略的工生成厂
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/26 23:28
 */
public class CaveatStrategyFactory {

    /**
     * 创建策略
     * @param service 策略
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
