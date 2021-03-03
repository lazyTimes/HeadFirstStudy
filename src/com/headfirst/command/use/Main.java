package com.headfirst.command.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.use
 * @Description : 单元测试
 * @Create on : 2021/2/24 17:09
 **/
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new LightCommandConcrete());
        remoteControl.execute();
        remoteControl.setCommand(new SwitchCommandConcrete());
        remoteControl.execute();
    }
}
