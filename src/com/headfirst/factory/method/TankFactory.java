package com.headfirst.factory.method;

import com.headfirst.factory.use.Tank;

/**
 * 坦克工厂
 * 工厂增加抽象方法由子类进行构建
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/16 17:33
 */
public abstract class TankFactory {

    /**
     * 创建坦克
     * @return
     */
    public Tank createTank(String check){
        return createConcreteTankMethod(check);
    }

    /**
     * 构建具体产品过程的方法
     * @return
     */
    protected abstract Tank createConcreteTankMethod(String check);


}
