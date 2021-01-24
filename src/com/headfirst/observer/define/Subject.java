package com.headfirst.observer.define;

/**
 * 主题
 * 主题的接口，具体的主题由子类实现
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 15:19
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver();

    /**
     * 通知观察者
     */
    void notifyObserver();

    /**
     * 移除观察者
     */
    void removeObserver();
}
