package com.headfirst.observer.whetherStation;

/**
 * 布告板，是观察者的接口
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 15:48
 */
public interface Observer {

    /**
     * 更新数据，需要由发布者进行更新调用
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);

}
