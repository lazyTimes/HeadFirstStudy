package com.headfirst.observer.fund.use;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 基金具体的实现方
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/31 20:26
 */
public class FundConcreteSubject implements FundSubject {

    /**
     * 当前的单位净值
     */
    private double nownum;

    /**
     * 绑定所有的订阅者
     */
    private List<FundObserver> list;

    public FundConcreteSubject() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(FundObserver fundObserver) {
        list.add(fundObserver);
    }

    @Override
    public void removeObserver(FundObserver fundObserver) {
        list.remove(fundObserver);
    }

    @Override
    public void notifyAllObserver() {

        list.forEach(item -> item.change(nownum));
    }

    private void change() {
        double v = new Random(1000).nextDouble();
        // 单位净值改变，通知所有的股民
        nownum = v;
        notifyAllObserver();
    }
}
