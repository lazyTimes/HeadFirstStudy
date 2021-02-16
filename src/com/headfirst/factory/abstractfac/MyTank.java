package com.headfirst.factory.abstractfac;

import com.headfirst.factory.use.Tank;

import java.util.ArrayList;

/**
 * 我方坦克
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 21:58
 */
public class MyTank extends Tank {

    private Cannon cannon;

    public void display() {
        if (cannon != null){
            cannon.display();
        }
    }

    public MyTank() {
        // 我方坦克假设只有一条命
        hp = 1;
        bullet = new ArrayList<>();
        // 初始化添加三发子弹
        bullet.add(new Object());
        bullet.add(new Object());
        bullet.add(new Object());
    }

    @Override
    public void move() {
        System.err.println("移动");
    }

    @Override
    public void attack() {
        System.err.println("攻击地方坦克");
        // ..弹出子弹
        if (bullet.size() == 0) {
            System.err.println("没有子弹了");
            return;
        }
        bullet.remove(bullet.get(bullet.size() - 1));
    }

    @Override
    public void stop() {
        System.err.println("停止");
    }

}
