package com.headfirst.combination;

import java.util.List;

/**
 * 组件的实现类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 16:47
 */

public class MenuItem extends MenuComponent {

    /**
     * 菜单的节点名称
     */
    private String name;

    /**
     * 介绍信息
     */
    private String description;

    @Override
    public void operation() {
        System.err.println("叶子节点的操作行为");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
