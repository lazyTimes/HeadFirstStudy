package com.headfirst.observer.fund.jdk;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/1 22:44
 */
public class Main {
    public static void main(String[] args) {
        JdkFundObserver jdkFundObserver = new JdkFundObserverConstruct();
        JdkFundSubject jdkFundSubject = new JdkFundSubject();
        jdkFundSubject.addObserver(jdkFundObserver);
        jdkFundSubject.NotifyAll();
    }
}
