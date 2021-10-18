package com.headfirst.combination;

import java.util.List;

/**
 * 组件
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 16:47
 */
public abstract class MenuComponent {

    /**
     * 添加菜单
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("unsupport");
    }

    /**
     * 操作
     */
    public void operation() {
        throw new UnsupportedOperationException("unsupport");
    }

    /**
     * 获取子节点或者子菜单
     *
     * @param id
     * @return
     */
    public MenuComponent getChild(int id) {
        throw new UnsupportedOperationException("unsupport");
    }

    /**
     * 获取所有的子节点
     *
     * @param id
     * @return
     */
    public List<MenuComponent> getChilds(int id) {
        throw new UnsupportedOperationException("unsupport");
    }

}
