package com.headfirst.templatemethod.non;

import com.headfirst.templatemethod.use.TemplateWorkFlow;

/**
 * 圣诞帽玩具制作流程
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/7 11:06
 */
public class ChristmasHatWorkFlow{

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

    public void reverseToy() {
        System.out.println("圣诞帽反转");
        System.out.println("圣诞帽帽子顶部的小秋顶出去");
    }
}
