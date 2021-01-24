package com.headfirst.observer.jdkobserver;

import com.headfirst.observer.whetherStation.Observer;

import java.util.List;
import java.util.Observable;

/**
 * 使用JDK的发布者
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 17:40
 */
public class WeatherDataSubject extends Observable {


    /**
     * 温度
     */
    private float temp;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;


    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }


    public float getPressure() {
        return pressure;
    }

    /**
     * 更新数据之后通知所有的观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        // 通知所有的观察者更新数据
        notifyObservers();
    }

}
