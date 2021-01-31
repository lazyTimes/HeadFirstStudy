package com.headfirst.observer.fund.use;

/**
 * 具体的顾明订阅者实现
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/31 20:23
 */
public class StockholderObserver implements FundObserver {

    /**
     * 当前订阅者关注的单位净值数据
     */
    private double num;

    @Override
    public void change(double num) {
        this.num = num;
        display();
    }

    public void display() {
        System.out.println("当前股票的净值为:" + num);
    }
}
