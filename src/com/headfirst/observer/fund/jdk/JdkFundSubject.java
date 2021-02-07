package com.headfirst.observer.fund.jdk;

import java.util.*;

/**
 * JDK发布者
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/1 22:21
 */
public class JdkFundSubject extends Observable {

    private List<JdkFundObserver> fundObservers;

    private double price;

    public JdkFundSubject() {
        this.fundObservers = new ArrayList<>();
    }



    public void NotifyAll(){
        price = new Random(1000).nextDouble();
        setChanged();
        notifyObservers(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
