package com.headfirst.observer.whetherStation;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象数据
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 15:53
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
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

    public WeatherData() {
        // 初始化订阅者列表
        this.observers = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.size() == 0){
            throw new RuntimeException("当前订阅者为空，无法移除");
        }
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者
     */
    public void measurementsChanged(){
        notifyObserver();
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
        measurementsChanged();
    }
}
