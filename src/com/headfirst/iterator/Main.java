package com.headfirst.iterator;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 9:46
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(new FileManager(), new MissionBoard());
        computer.display();
    }


}
