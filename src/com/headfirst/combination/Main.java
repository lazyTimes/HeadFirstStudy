package com.headfirst.combination;

import com.headfirst.command.non.Light;
import com.headfirst.command.non.RemoteControl;
import com.headfirst.command.non.Television;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.command.non
 * @Description : 组合模式的单元测试
 * @Create on : 2021/2/24 16:11
 **/
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setName("父级菜单1");
        menu.setName("父级菜单2");
        menu.setName("父级菜单3");
        MenuItem menuItem = new MenuItem();
        menuItem.setName("子级菜单1");
        menuItem.setName("子级菜单2");
        menuItem.setName("子级菜单3");
    }
}/*运行结果：
*/
