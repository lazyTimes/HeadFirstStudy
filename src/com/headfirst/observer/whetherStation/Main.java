package com.headfirst.observer.whetherStation;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 16:58
 */
public class Main {

    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        // 创建3位订阅者
        Observer observer1 = new CurrentCondition(subject);
        Observer observer2 = new CurrentCondition(subject);
        Observer observer3 = new CurrentCondition(subject);
        // 更新数据
        subject.setMeasurements(1.5f, 2.5f, 33f);
        subject.setMeasurements(177f, 177f, 177f);


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
