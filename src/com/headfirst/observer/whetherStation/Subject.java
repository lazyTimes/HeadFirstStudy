package com.headfirst.observer.whetherStation;

/**
 * 气象站数据主题
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 15:47
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);
}
