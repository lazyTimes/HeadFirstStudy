package com.headfirst.command.use;

import com.headfirst.command.non.Light;
import com.headfirst.command.non.Television;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.non
 * @Description : 遥控器
 * @Create on : 2021/2/24 16:12
 **/
public class RemoteControl {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
