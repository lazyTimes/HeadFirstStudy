package com.headfirst.decoration.non;

/**
 * 调料父类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:23
 */
public abstract class Codiment {

    /**
     * 为装饰类添加附加值
     * @return
     */
    protected abstract void plusAdditionVal(MilkTea milkTea);

    /**
     * 详细信息
     */
    protected String description(){
        return "无任何配料";
    }

}
