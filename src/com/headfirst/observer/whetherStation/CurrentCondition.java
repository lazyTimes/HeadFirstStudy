package com.headfirst.observer.whetherStation;

/**
 * 布告板
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 16:53
 */
public class CurrentCondition  implements Observer,DisplayElement{
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

    /**
     * 订阅的主题
     */
    private Subject subject;

    public CurrentCondition(Subject subject) {
        this.subject = subject;
        // 关键一步，把自己订阅到对应的主题
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.err.println("temp = "+ temp + " humidity =" + humidity + "pressure = "+ pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
