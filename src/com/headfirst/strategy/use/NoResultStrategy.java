package com.headfirst.strategy.use;

import com.headfirst.strategy.CaveatStrategy;

import java.util.Map;

/**
 * 查不出必要数据的时候，给出对应的告警。提醒运营人员排查线上环境
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/28 21:52
 */
public class NoResultStrategy implements CaveatStrategy {
    @Override
    public void warning(Map<String, Object> params) {
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
            System.err.println("执行报警完成");
            throw e;
        }

    }
}
