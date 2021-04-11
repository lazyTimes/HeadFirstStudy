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

    private Stack<TaskItem> taskItems;

    public MissionBoard() {
        taskItems = new Stack<>();
        taskItems.push(new TaskItem("任务1", 10));
        taskItems.push(new TaskItem("任务2", 1230));
        taskItems.push(new TaskItem("任务3", 123));
        taskItems.push(new TaskItem("任务4", 414));
        taskItems.push(new TaskItem("任务5", 555));
    }

    @Override
    public Iterator createIterator() {
        return new TaskItemlIterator(taskItems);
    }

}
