package com.headfirst.command.non;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.non
 * @Description : 遥控器
 * @Create on : 2021/2/24 16:12
 **/
public class RemoteControl {

    private Light light;

    private Television television;

    public RemoteControl(Light light, Television television) {
        this.light = light;
        this.television = television;
    }

    public void button1(){
        light.on();
    }

    public void button2(){
        television.on();
    }
}
