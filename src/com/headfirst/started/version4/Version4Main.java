package com.headfirst.started.version4;

/**
 *
 * 单元测试
 * @author zxd
 * @version 1.0
 * @date 2021/1/24 14:17
 */
public class Version4Main {

    public static void main(String[] args) {
        ActiveDuck mallardDuck = new MiniDuckSimulation();
        mallardDuck.setFlyBehavior(new FlyCustomWay());
        mallardDuck.performanFly();
        // 我们使用其他的
        mallardDuck.setFlyBehavior(new FlySimulaWay());
        mallardDuck.performanFly();
//        mallardDuck.performanQuack();
    }
    /*//运行结果
        带翅膀的飞行
        火箭飞行
     */
    //
}
