package com.headfirst.templatemethod.use;

/**
 * 模板方法
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/7 10:54
 */
public abstract class TemplateWorkFlow {

    public void productToy(){
        takeToy();
        reverseToy();
        putBasket();
    }

    public final void putBasket() {
        System.out.println("把玩具放到玩具篮");
    }

    public void takeToy(){
        System.out.println("拿起玩具");
    }

    public abstract void reverseToy();

}
