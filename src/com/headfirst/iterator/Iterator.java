package com.headfirst.iterator;

/**
 * 迭代器
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:18
 */
public interface Iterator<E extends Object> {

    public boolean hasNext();

    public E next();

    public void remove(E ele);
}
