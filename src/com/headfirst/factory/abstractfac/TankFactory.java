package com.headfirst.factory.abstractfac;

import com.headfirst.factory.use.BigTank;
import com.headfirst.factory.use.MouseTank;
import com.headfirst.factory.use.MyTank;
import com.headfirst.factory.use.Tank;

import java.util.Objects;

/**
 * 坦克工厂，专门负责生产坦克
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/25 22:27
 */
public interface TankFactory {

    /**
     * 坦克创建方法抽象
     * @return
     */
    Tank createTank();
}
