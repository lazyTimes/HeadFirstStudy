package com.headfirst.member.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.member.use
 * @Description : 恢复器：负责从 Memento 中恢复对象的状态，可以看作是一个记录提取器或者说恢复器。
 * @Create on : 2021/10/27 14:38
 **/
public class CareTaker {

    private Memento memento;

    public CareTaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
