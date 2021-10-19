package com.headfirst.state.non;

import static com.headfirst.state.non.MechanicaState.*;

/**
 * 糖果机
 */
public class CandyMechanica {

    /**
     * 默认是售罄的状态
     */
    private int sold_state = SOLD_OUT;

    /**
     * 糖果数量
     */
    private int count = 0;

    public CandyMechanica(int count) throws InterruptedException {
        if(count <= 0){
            throw new InterruptedException("初始化失败");
        }else {
            sold_state = NOT;
        }
        System.out.println("欢迎光临糖果机，当前糖果机的糖果数量为："+ count);
        this.count = count;
    }


    /**
     * 启动糖果机
     */
    public void startUp(){
        switch (sold_state){
            case NOT:
                System.out.println("当前糖果机没有硬币，请先投入硬币");
                break;
            case SOLD:
                System.out.println("糖果售出中，请稍后");
                break;
            case HAS:
                sold_state = SOLD;
                candySold();
                break;
            case SOLD_OUT:
                System.out.println("糖果已售罄");
                break;


        }
    }

    /**
     * 投入硬币的操作
     */
    public void putCoin(){
        switch (sold_state){
            case NOT:
                sold_state = HAS;
                System.out.println("投入硬币成功，请开启糖果机");
                break;
            case SOLD:
                System.out.println("糖果售出中，请勿重复投放");
                break;
            case HAS:
                System.out.println("当前已经存在硬币，请勿重复投放");
                break;
            case SOLD_OUT:
                System.out.println("糖果已售罄,您投入的硬币将会在稍后退回");
                break;


        }
    }


    /**
     * 售出糖果
     */
    public void candySold(){
        switch (sold_state){
            case NOT:
                System.out.println("当前机器内没有硬币，请先投入硬币");
                break;
            case SOLD:
                System.out.println("糖果已售出，请取走您的糖果");
                count--;
                if(count == 0){
                    System.out.println("当前糖果已经售罄");
                    sold_state = SOLD_OUT;
                }
                sold_state = NOT;
                break;
            case HAS:
                sold_state = NOT;
                System.out.println("当前已经存在硬币，请勿重复投放");
                break;
            case SOLD_OUT:
                System.out.println("已经售罄");
                break;

        }
    }



}
