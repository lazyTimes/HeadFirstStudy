package com.headfirst.factory.use;

import com.headfirst.factory.non.BigTank;
import com.headfirst.factory.non.MouseTank;
import com.headfirst.factory.non.MyTank;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 22:15
 */
public class Main {

    /**
     * 我们将生产坦克的过程全部交给了工厂来处理
     * 可能还是奇怪，这和刚才没有什么区别呀？
     * 我们来看下区别：
     * 1. 创建的过程没有了，虽然是一个简单的new，但是new的过程交给了工厂
     * 2. 我们后续如果要在坦克加入别的东西，只需要去改工厂类和具体的实现类，不需要该此处代码
     * 3. 如果不支持的操作，工厂还可以通知我们这样做不对
     * @param args
     */
    public static void main(String[] args) {

        TankFactory tankFactory = new TankFactory();

        Tank my = tankFactory.createTank("my");
        Tank mouse = tankFactory.createTank("mouse");
        Tank big = tankFactory.createTank("big");
        // 我要一个没有的设计过的坦克
        Tank mybig = tankFactory.createTank("mybig");


    }/*//
    运行结果：
    Exception in thread "main" 老鼠坦克移动
    巨型坦克移动
    老鼠坦克开枪
    巨型坦克开枪
    老鼠坦克开枪
    java.lang.UnsupportedOperationException: 当前坦克不支持生产
	at com.headfirst.factory.use.TankFactory.createTank(TankFactory.java:27)
	at com.headfirst.factory.use.Main.main(Main.java:33)
    */



}
