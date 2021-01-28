package com.headfirst.strategy.use;

import com.headfirst.strategy.CaveatStrategy;

import java.util.Map;

/**
 * 当出现黑名单人员进行交易拦截的时候，进行日志记录，不进行警告
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 21:52
 */
public class BlackListStrategy implements CaveatStrategy {

    @Override
    public void warning(Map<String, Object> params) {
        boolean flag = Boolean.parseBoolean(params.get("flag").toString());
        if (flag) {
            System.err.println("触犯黑名单列表，但不警告");
        }
    }
}
