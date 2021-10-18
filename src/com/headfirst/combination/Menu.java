package com.headfirst.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 16:46
 */
public class Menu extends MenuComponent {

    private String name;

    private List<MenuComponent> childs = new ArrayList<>();

    @Override
    public void add(MenuComponent menuComponent) {
        childs.add(menuComponent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public MenuComponent getChild(int id) {
        MenuComponent menuItem = childs.get(id);
        return menuItem;
    }

    @Override
    public List<MenuComponent> getChilds(int id) {
        return childs;
    }
}
