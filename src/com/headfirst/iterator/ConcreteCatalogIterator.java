package com.headfirst.iterator;

import java.util.Stack;

/**
 * 迭代器实现类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:19
 */
public class ConcreteCatalogIterator implements Iterator {

    private int index;

    private TaskItem[] taskItems;

    public ConcreteCatalogIterator(TaskItem[] taskItems) {
        this.index = 0;
        this.taskItems = taskItems;
    }

    @Override
    public boolean hasNext() {
        return index++ < taskItems.length - 1;
    }

    @Override
    public Object next() {
        return taskItems[index];
    }

    @Override
    public void remove(Object ele) {
        throw new UnsupportedOperationException("数组不支持当前操作");
    }
}
