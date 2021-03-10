package com.headfirst.iterator;

/**
 * 聚合对象接口
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:20
 */
public interface Travelsable<E extends Object>{

    /**
     * 创建迭代器的方法
     * @return
     */
    Iterator<E> createIterator();
}
