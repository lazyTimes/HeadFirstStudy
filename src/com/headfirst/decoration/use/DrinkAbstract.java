package com.headfirst.decoration.use;

/**
 * 饮料的抽象类，定义饮料的通用接口
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 23:46
 */
public interface DrinkAbstract {

    /**
     * 装饰接口
     */
    void plusAdditionVal();

    /**
     * 计算售价
     * @return
     */
    double coat();
}
