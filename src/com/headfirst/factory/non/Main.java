package com.headfirst.factory.non;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 22:15
 */
public class Main {

    /**
     * 这种频繁的new，让我们逐渐变成面向过程编程。。。。
     * @param args
     */
    public static void main(String[] args) {
        // 虽然我们可以自己生产坦克，但是我们每次都需要自己手动去生产对应的坦克。这种频繁的new 操作
        Tank bigTank1 = new BigTank();
        Tank bigTank2 = new BigTank();
        Tank bigTank3 = new BigTank();
        Tank bigTank4 = new BigTank();
        // 有多少个对象，就有多少个new
        Tank mouseTank1 = new MouseTank();
        Tank mouseTank2 = new MouseTank();
        Tank mouseTank3 = new MouseTank();
        Tank mouseTank4 = new MouseTank();

        // 我方坦克，需要自己操作
        Tank myTank1 = new MyTank();
        Tank myTank2 = new MyTank();

    }/*//运行结果：
        停止
        老鼠坦克移动
        老鼠坦克开枪
        老鼠坦克开枪
        停止
        老鼠坦克移动
        老鼠坦克开枪
        巨型坦克移动
        巨型坦克开枪
        老鼠坦克开枪
        老鼠坦克没有子弹了
        停止
        老鼠坦克移动
        老鼠坦克开枪
        老鼠坦克没有子弹了
        老鼠坦克开枪
        老鼠坦克没有子弹了
        巨型坦克移动
        巨型坦克开枪
    */



}
