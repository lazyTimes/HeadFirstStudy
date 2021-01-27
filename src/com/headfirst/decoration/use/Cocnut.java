package com.headfirst.decoration.use;

/**
 * 椰果
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/27 23:12
 */
public class Cocnut extends DecorationAbstract implements DecorationDrink{

    private DecorationDrink decorationDrink;

    public Cocnut(DecorationDrink decorationDrink) {
        this.decorationDrink = decorationDrink;
    }

    @Override
    public int coat() {
        return super.coat() + 1;
    }

    @Override
    public void decoration() {
        decorationDrink.decoration();
    }
}
