package com.headfirst.decoration.use;


/**
 * 调料父类
 * 这里需要实现饮料接口
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:23
 */
public abstract class Codiment implements DrinkAbstract{


    /**
     * 为装饰类添加附加值
     * @return
     */
    public void plusAdditionVal(){
        description();
    }

    @Override
    public double coat() {
        return 5.0f;
    }

    /**
     * 详细信息
     */
    private String description(){
        return "无任何配料";
    }

}
