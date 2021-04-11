package com.headfirst.combination;

import java.util.List;

/**
 * 组件
 *
 * @author zxd
 * @version 1.0
 * @date 2021/4/11 16:47
 */
public interface Component {

    void operation();

    List<Component> getChild();


}
