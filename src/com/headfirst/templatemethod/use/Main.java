package com.headfirst.templatemethod.use;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/7 11:12
 */
public class Main {
    public static void main(String[] args) {
        TemplateWorkFlow templateWorkFlow = new ChristmasHatWorkFlow();
        TemplateWorkFlow templateWorkFlow1 = new AntlersToyWorkFlow();
        templateWorkFlow.productToy();
        templateWorkFlow1.productToy();
    }/*
    拿起玩具
    圣诞帽反转
    圣诞帽帽子顶部的小秋顶出去
    把玩具放到玩具篮
    拿起玩具
    把主干翻面
    把鹿角的分叉翻页
    把玩具放到玩具篮

    */
}
