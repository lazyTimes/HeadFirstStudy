package com.headfirst.iterator;

import java.util.Stack;

/**
 * 普通迭代器
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:55
 */
public class TaskItemlIterator implements Iterator{

    private Stack<TaskItem> taskItems;

    public TaskItemlIterator(Stack<TaskItem> taskItems) {
        this.taskItems = taskItems;
    }

    @Override
    public boolean hasNext() {
        TaskItem peek = taskItems.peek();
        return peek != null;
    }

    @Override
    public Object next() {
        return taskItems.pop();
    }

    @Override
    public void remove(Object ele) {
        taskItems.remove(ele);
    }
}
