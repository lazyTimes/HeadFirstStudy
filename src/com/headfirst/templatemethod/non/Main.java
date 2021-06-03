package com.headfirst.templatemethod.non;

/**
 * 单元测试
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/7 11:30
 */
public class Main {

    public static void main(String[] args) {
        AntlersToyWorkFlow antlersToyWorkFlow = new AntlersToyWorkFlow();
        antlersToyWorkFlow.productToy();
        ChristmasHatWorkFlow christmasHatWorkFlow = new ChristmasHatWorkFlow();
        christmasHatWorkFlow.productToy();

    }/*
    拿起玩具
    把主干翻面
    把鹿角的分叉翻页
    把玩具放到玩具篮
    拿起玩具
    圣诞帽反转
    圣诞帽帽子顶部的小秋顶出去
    把玩具放到玩具篮

    */
}
