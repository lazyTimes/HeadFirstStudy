package com.headfirst.decoration.non;

/**
 * 配料：椰果
 *
 * @author zxd
 * @version 1.0
 * @date 2021/2/7 22:30
 */
public class Coconut extends Codiment{
    @Override
    public void plusAdditionVal(MilkTea milkTea) {
        if(milkTea == null){
            throw new RuntimeException("对不起，请先添加奶茶");
        }
        milkTea.setPrice(milkTea.getPrice() + 1);
        milkTea.setName(milkTea.getName() + "," +description());
    }

    @Override
    protected String description() {
        return "椰果";
    }


}
