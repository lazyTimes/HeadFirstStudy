package com.headfirst.decoration.use;

/**
 * 牛奶s
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:05
 */
public class Milk implements DecorationDrink{

    private DecorationDrink decorationDrink;

    public Milk(DecorationDrink decorationDrink) {
        this.decorationDrink = decorationDrink;
    }
    @Override
    public void decoration() {
        decorationDrink.decoration();
        System.out.println("加入了牛奶，物品涨价");
    }
}
