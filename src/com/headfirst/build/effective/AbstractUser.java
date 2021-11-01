package com.headfirst.build.effective;

import java.util.ArrayList;
import java.util.List;

import static com.headfirst.build.effective.AbstractUser.NATURE.LIVELY;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.build.effective
 * @Description : 小孩构建器
 * @Create on : 2021/10/29 17:30
 **/
public abstract class AbstractUser {

    private final NATURE nature;

    protected enum NATURE {LIVELY, MELANCHOLY, LONELY, NORMAL}

    abstract static class Builder<T extends Builder<T>> {

        private NATURE nature = LIVELY;

        /**
         * 构建方法
         *
         * @return
         */
        protected abstract T build();

        /**
         * 需要由子类实现
         *
         * @return
         */
        protected abstract AbstractUser process();


    }

    public AbstractUser(Builder builder) {
        this.nature = builder.nature;

    }
}
