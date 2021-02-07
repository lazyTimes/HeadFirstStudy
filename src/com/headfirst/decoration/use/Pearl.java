package com.headfirst.decoration.use;



/**
 * 配料：珍珠
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:27
 */
public class Pearl extends Codiment implements DrinkAbstract{

    private DrinkAbstract drinkAbstract;

    public Pearl(DrinkAbstract drinkAbstract) {
        this.drinkAbstract = drinkAbstract;
    }

    @Override
    public void plusAdditionVal() {
        // 如果是奶茶
        if(drinkAbstract instanceof MilkTea){
            MilkTea drinkAbstract = (MilkTea) this.drinkAbstract;
            drinkAbstract.setName(drinkAbstract.getName() + " -- " + "珍珠");
            drinkAbstract.setPrice(drinkAbstract.getPrice() + 55);
            description();
        }
    }

    @Override
    public double coat() {
        return 5;
    }


    /**
     * 详细信息
     */
    protected String description(){
        drinkAbstract.plusAdditionVal();
        return "";
    }
}
