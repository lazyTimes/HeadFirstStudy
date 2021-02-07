package com.headfirst.observer.fund.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * JDK订阅者实现
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/1 22:47
 */
public class JdkFundObserverConstruct implements JdkFundObserver {

    private double price;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof JdkFundSubject) {
            if (arg == null)
                price += 1d;
            else
                price = (double) arg;
            System.err.println(price);
            price = ((JdkFundSubject) o).getPrice();
            System.err.println(price);
        }
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
