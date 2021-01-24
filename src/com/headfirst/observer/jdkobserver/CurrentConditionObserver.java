package com.headfirst.observer.jdkobserver;

import com.headfirst.observer.whetherStation.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * JDK实现观察者
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 18:40
 */
public class CurrentConditionObserver implements Observer, DisplayElement {


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

    @Override
    public void update(Observable o, Object arg) {
        // 注意此处不同
        if(o instanceof WeatherDataSubject){
            this.temp = ((WeatherDataSubject) o).getTemp();
            this.humidity = ((WeatherDataSubject) o).getHumidity();
            this.pressure = ((WeatherDataSubject) o).getPressure();
            display();
        }
        // 其他情况.....

    }

    @Override
    public void display() {
        System.err.println("temp = "+ temp + " humidity =" + humidity + "pressure = "+ pressure);
    }
}
