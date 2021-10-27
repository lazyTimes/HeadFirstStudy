package com.headfirst.member.use;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.member.use
 * @Description : 备忘录:包含了要被恢复的对象的状态，是快照的具体存储位置
 * @Create on : 2021/10/27 14:04
 **/
public class Memento {

    /**
     * 需要被备份的状态
     */
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
