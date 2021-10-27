package com.headfirst.member.use;

import java.util.Optional;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.member.use
 * @Description : 客户端的操作
 * @Create on : 2021/10/27 16:19
 **/
public class Client {

    private Originator originator;

    public Client(Originator originator) {
        this.originator = originator;
    }

    /**
     * 恢复记录的状态
     */
    public void restore(CareTaker careTaker) {
        originator.setState(Optional.ofNullable(careTaker)
                .map(CareTaker::getMemento)
                .map(Memento::getState)
                .orElse("off"));
    }
}
