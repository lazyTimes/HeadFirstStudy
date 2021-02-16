package com.headfirst.factory.method;

import com.headfirst.factory.use.Tank;

/**
 * 工厂方法的单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 17:50
 */
public class Main {

    public static void main(String[] args) {
        TankFactory tankFactory = new MouseTankFactory();
        TankFactory ourTankFactory = new OurTankFactory();
        Tank my = tankFactory.createTank("mouse");
        Tank mouse = ourTankFactory.createTank("my");
        System.err.println(my);
        System.err.println(mouse);
    }/*运行结果：
    com.headfirst.factory.use.MouseTank@677327b6
    老鼠坦克移动
    com.headfirst.factory.use.MyTank@14ae5a5
    老鼠坦克开枪
    老鼠坦克开枪
    */
}
