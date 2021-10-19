package com.headfirst.state.use;

/**
 * 糖果状态
 */
public interface CandyState {

    /**
     * 启动糖果机
     */
    void startUp();

    /**
     * 投入硬币
     */
    void putCoin();

    /**
     * 推出糖果
     */
    void candySold();
}
