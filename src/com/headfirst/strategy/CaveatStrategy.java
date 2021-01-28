package com.headfirst.strategy;

import java.util.Map;

/**
 * 警告策略接口抽象类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/26 23:28
 */
public interface CaveatStrategy {

    /**
     * 告警方法
     * @param params 所需参数
     */
    void warning(Map<String, Object> params);
}
