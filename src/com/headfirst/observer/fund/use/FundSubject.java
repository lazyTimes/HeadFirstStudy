package com.headfirst.observer.fund.use;

/**
 * 基金的相关接口
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/31 20:19
 */
public interface FundSubject {

    /**
     * 注册订阅者
     * @param fundObserver 订阅者
     */
    void registerObserver(FundObserver fundObserver);

    /**
     * 移除指定订阅者
     * @param fundObserver 订阅者
     */
    void removeObserver(FundObserver fundObserver);

    /**
     * 通知所有的订阅者
     */
    void notifyAllObserver();


}
