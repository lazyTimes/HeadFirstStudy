package com.headfirst.chain.use;

import com.sun.istack.internal.Nullable;

import java.util.Objects;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.chain
 * @Description : 责任链模式
 * @Create on : 2021/10/22 13:50
 **/
public interface Request {

   /**
    * 责任链的规范接口
    * @param val1 参数1
    * @param val1 参数2
    * @return
    */
   int process(int val1, int val2);
}
