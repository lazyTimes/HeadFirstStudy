package com.headfirst.iterator;

/**
 * 项目内容
 *
 * @author zxd
 * @version 1.0
 * @date 2021/3/10 22:26
 */
public class TaskItem {

    private String name;

    private int size;

    public TaskItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
