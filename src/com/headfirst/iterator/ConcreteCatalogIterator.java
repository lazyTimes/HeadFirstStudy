package com.headfirst.iterator;

/**
 * 迭代器实现类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:19
 */
public class ConcreteCatalogIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove(Object ele) {

    }
}
