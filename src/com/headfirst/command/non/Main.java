package com.headfirst.command.non;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.non
 * @Description : 单元测试
 * @Create on : 2021/2/24 16:11
 **/
public class Main {

    public static void main(String[] args) {
        Television television = new Television();
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl(light, television);
        remoteControl.button1();
        remoteControl.button2();

    }
}/*运行结果：
打开灯光
打开电视
*/
