package com.headfirst.decoration.use;

/**
 * 配料抽象类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:28
 */
public class DecorationAbstract implements DecorationDrink {
    @Override
    public void decoration() {
        System.out.println("没有配料");
    }

    @Override
    public int coat() {
        return 0;
    }
}
