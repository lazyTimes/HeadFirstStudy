package com.headfirst.command.use;

import com.headfirst.command.non.Light;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.use
 * @Description : 命令实现类
 * @Create on : 2021/2/24 16:45
 **/
public class LightCommandConcrete implements Command {

    private Light light = new Light();

    @Override
    public void execute() {
        light.on();
    }
}
