package com.headfirst.strategy.goods;

import com.headfirst.strategy.CaveatStrategy;

import java.util.Map;

/**
 * 无结果的业务实现
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 23:08
 */
//@Service
public class NoResultStrategyImpl implements CaveatStrategy {


    // 一般此处会组合一些mapper或者引入一些日志记录logger

    @Override
    public void warning(Map<String, Object> params) {
        // loggger.info("记录需要的信息");
        int divisor = Integer.parseInt(params.get("divisor").toString());
        int dividend = Integer.parseInt(params.get("dividend").toString());
        try {
            int result = dividend / divisor;
        } catch (Exception e) {
            System.err.println("警告，服务器出现异常");
            System.out.println("开始执行报警");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            // logger.info("日志记录");
            System.err.println("执行报警完成");
            throw e;
        }
        // 执行一些策略等


    }
}
