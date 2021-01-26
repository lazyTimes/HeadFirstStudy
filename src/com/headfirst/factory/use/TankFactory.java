package com.headfirst.factory.use;

import java.util.Objects;

/**
 * 坦克工厂，专门负责生产坦克
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 22:27
 */
public class TankFactory {

    /**
     * 创建坦克
     * @return
     */
    public Tank createTank(String check){
        Tank tank = null;
        if(Objects.equals(check, "my")){
            tank = new MyTank();
        }else if(Objects.equals(check, "mouse")){
            tank = new MouseTank();
        }else if (Objects.equals(check, "big")){
            tank = new BigTank();
        }else {
            throw new UnsupportedOperationException("当前坦克不支持生产");
        }
        return tank;
    }
}
