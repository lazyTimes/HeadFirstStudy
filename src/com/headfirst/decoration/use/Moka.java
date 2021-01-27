package com.headfirst.decoration.use;

/**
 * 摩卡
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:30
 */
public class Moka implements DecorationDrink{
    @Override
    public void decoration() {
        System.out.println("普通的摩卡售价为10块钱");
    }

    @Override
    public int coat() {
        return 10;
    }
}
