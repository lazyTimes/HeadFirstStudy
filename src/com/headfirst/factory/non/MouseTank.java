package com.headfirst.factory.non;

import java.util.ArrayList;
import java.util.Random;

/**
 * 老鼠坦克
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 22:02
 */
public class MouseTank extends Tank implements Runnable {

    public void display() {
        System.err.println("长得尖尖的，很像老鼠");
    }

    public MouseTank() {
        // 坦克假设只有一条命
        hp = 1;
        new Thread(this).start();
        bullet = new ArrayList<>();
        // 初始化添加六发子弹
        bullet.add(new Object());
        bullet.add(new Object());
        bullet.add(new Object());
        bullet.add(new Object());
        bullet.add(new Object());
    }

    @Override
    void move() {
        System.err.println("老鼠坦克移动");
    }

    @Override
    void attack() {
        System.err.println("老鼠坦克开枪");
        // ..弹出子弹
        if (bullet.size() <= 0) {
            System.err.println("老鼠坦克没有子弹了");
            return;
        }
        // 老鼠坦克一次性开两枪
        bullet.remove(bullet.get(bullet.size() - 1));
    }

    @Override
    void stop() {
        System.err.println("停止");
    }

    @Override
    public void run() {
        while (true) {
            // 一旦创建就开始移动
            move();
            // 漫无目的开枪
            attack();
            attack();
            // 做完一轮操作歇一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 随机停止
            if (new Random(100).nextInt() % 2 == 0) {
                stop();
            }
        }
    }
}
