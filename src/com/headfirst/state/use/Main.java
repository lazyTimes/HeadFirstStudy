package com.headfirst.state.use;

import com.headfirst.state.non.CandyMechanica;

/**
 * 单元测试
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        CandyMechanica candyMechanica = new CandyMechanica(5);
        candyMechanica.putCoin();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.candySold();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
        candyMechanica.putCoin();
        candyMechanica.startUp();
    }
}/*运行结果：
欢迎光临糖果机，当前糖果机的糖果数量为：5
投入硬币成功，请开启糖果机
当前已经存在硬币，请勿重复投放
糖果已售出，请取走您的糖果
当前机器内没有硬币，请先投入硬币
当前糖果机没有硬币，请先投入硬币
投入硬币成功，请开启糖果机
糖果已售出，请取走您的糖果
投入硬币成功，请开启糖果机
糖果已售出，请取走您的糖果
投入硬币成功，请开启糖果机
糖果已售出，请取走您的糖果
投入硬币成功，请开启糖果机
糖果已售出，请取走您的糖果
当前糖果已经售罄
*/
