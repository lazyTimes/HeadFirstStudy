package com.headfirst.observer.fund.use;

/**
 * 股民 - 订阅者
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/31 20:18
 */
public interface FundObserver {

    /**
     * 基金涨跌接口
     */
    void change(double num);
}
