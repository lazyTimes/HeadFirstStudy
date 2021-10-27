package com.headfirst.member.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.member.use
 * @Description : 原发器：需要被备份状态的对象
 * @Create on : 2021/10/27 14:02
 **/
public class Originator {

    private String state;

    public Originator() {

    }

    public Originator(Memento memento) {
        memento = new Memento(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
