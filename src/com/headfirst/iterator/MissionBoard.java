package com.headfirst.iterator;

import java.util.Stack;

/**
 * 聚合对象的具体实现子类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:20
 */
public class MissionBoard implements Travelsable {

    private Stack<TaskItem> taskItems = new Stack<>();

    @Override
    public Iterator createIterator() {
        return new TaskItemlIterator(taskItems);
    }

}
