package com.headfirst.factory.non;

import java.util.ArrayList;
import java.util.Random;

/**
 * 巨型坦克
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 22:14
 */
public class BigTank extends Tank implements Runnable{

    public void display() {
        System.err.println("巨型坦克");
    }

    public BigTank() {
        // 带颜色的坦克有很多条命
        hp = 5;
        new Thread(this).start();
        bullet = new ArrayList<>();
        // 初始化添加三发子弹
        bullet.add(new Object());
        bullet.add(new Object());
        bullet.add(new Object());
    }

    @Override
    void move() {
        System.err.println("巨型坦克移动");
    }

    @Override
    void attack() {
        System.err.println("巨型坦克开枪");
        // ..弹出子弹
        if (bullet.size() <= 0) {
            System.err.println("巨型坦克没有子弹了");
            return;
        }
        // 老鼠坦克一次性开两枪
        bullet.remove(bullet.get(bullet.size() - 1));
    }

    @Override
    void stop() {
        System.err.println("巨型坦克停止");
    }

    @Override
    public void run() {
        while (true) {
            // 一旦创建就开始移动
            move();
            // 漫无目的开枪
            attack();
            // 做完一轮操作歇两秒，
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 随机停止，活动没有老鼠坦克频繁
            if (new Random(1000).nextInt() % 2 == 0) {
                stop();
            }
        }
    }
}
