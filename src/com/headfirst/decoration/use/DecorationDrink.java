package com.headfirst.decoration.use;

/**
 * 装饰饮料的接口
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:08
 */
public interface DecorationDrink {

    /**
     * 装饰接口
     */
    void decoration();

    /**
     * 计算售价
     * @return
     */
    int coat();
}
