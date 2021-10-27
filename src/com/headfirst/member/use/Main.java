package com.headfirst.member.use;

import com.headfirst.adapter.use.*;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.adapter.use
 * @Description : 单元测试
 * @Create on : 2021/3/3 10:13
 **/
public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("on");
        System.out.println("备份状态"+ originator.getState());
        Memento memento = new Memento(originator.getState());
        CareTaker careTaker = new CareTaker(memento);
        //修改状态
        originator.setState("test");
        System.out.println("修改状态"+ originator.getState());
        Client client = new Client(originator);
        client.restore(careTaker);
        System.out.println("还原状态"+ originator.getState());
    }/*运行结果：
        备份状态on
        修改状态test
        还原状态on

    */
}
