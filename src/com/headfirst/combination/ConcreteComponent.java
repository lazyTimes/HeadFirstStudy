package com.headfirst.combination;

import java.util.List;

/**
 * 组件的实现类
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 16:47
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {

    }

    @Override
    public List<Component> getChild() {
        return null;
    }
}
