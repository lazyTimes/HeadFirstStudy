package com.headfirst.decoration.non;

/**
 * 配料：珍珠
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:27
 */
public class Pearl extends Codiment{


    @Override
    public void plusAdditionVal(MilkTea milkTea) {
        if(milkTea == null){
            throw new RuntimeException("对不起，请先添加奶茶");
        }
        milkTea.setPrice(milkTea.getPrice() + 2);
        milkTea.setName(milkTea.getName() + "," +description());
    }

    /**
     * 详细信息
     */
    protected String description(){
        return "珍珠";
    }
}
