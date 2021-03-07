package com.headfirst.templatemethod.use;

/**
 * 圣诞帽玩具制作流程
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/7 11:06
 */
public class ChristmasHatWorkFlow extends TemplateWorkFlow{
    @Override
    public void reverseToy() {
        System.out.println("圣诞帽反转");
        System.out.println("圣诞帽帽子顶部的小秋顶出去");
    }
}
