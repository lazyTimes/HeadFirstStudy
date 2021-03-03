package com.headfirst.command.use;

import com.headfirst.command.non.Television;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.use
 * @Description : 开关实现
 * @Create on : 2021/2/24 16:52
 **/
public class SwitchCommandConcrete implements Command{

    private Television television = new Television();

    @Override
    public void execute() {
        television.on();
    }
}
