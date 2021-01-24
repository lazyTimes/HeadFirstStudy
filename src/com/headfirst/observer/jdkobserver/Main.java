package com.headfirst.observer.jdkobserver;

import com.headfirst.observer.whetherStation.CurrentCondition;
import com.headfirst.observer.whetherStation.Observer;
import com.headfirst.observer.whetherStation.WeatherData;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 16:58
 */
public class Main {

    public static void main(String[] args) {

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        CurrentConditionObserver currentConditionObserver = new CurrentConditionObserver();
        weatherDataSubject.addObserver(currentConditionObserver);
        weatherDataSubject.setMeasurements(1, 1, 1);

    }
    /*//运行结果
    temp = 1.5 humidity =2.5pressure = 33.0
    temp = 1.5 humidity =2.5pressure = 33.0
    temp = 1.5 humidity =2.5pressure = 33.0
    temp = 177.0 humidity =177.0pressure = 177.0
    temp = 177.0 humidity =177.0pressure = 177.0
    temp = 177.0 humidity =177.0pressure = 177.0
    */
}
