package com.headfirst.strategy.non;

/**
 * 策略模式：
 * 不使用设计模式实现告警
 *
 * @author zxd
 * @version 1.0
 * @date 2021/1/26 23:41
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("接受交易");
        service1();
        service2();
        service3();
        System.out.println("完成交易");
    }

    /**
     * 模拟触发了业务场景1
     * 出现机房断电或者查不出必要数据的时候，给出对应的告警。提醒运营人员排查线上环境
     */
    private static void service1() {
        // 为了模拟异常情况，我们用 1/0 触发一个异常
        try {
            // 程序到了这一步算不下去了
            int result = 1/0;
            System.out.println("具体的业务");
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

    /**
     * 模拟触发了业务场景2
     * 当数据量到达指定的限制量的时候，给出风险告警。
     */
    private static void service2() {
        int limit = 1000;
        int count = 2000;
        if(count > limit){
            System.out.println("开始执行报警");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            //.....
            // logger.info("警告，当前数据请求量达到限制值")
            System.err.println("执行报警完成");
        }

    }

    /**
     * 模拟触发了业务场景3
     * 当出现黑名单人员进行交易拦截的时候，进行日志记录，不进行警告
     */
    private static void service3() {
        boolean flag = true;
        if(flag){
            // 触犯黑名单：
            // logger.info("警告，当前请求");
            // 提前退出，结束交易
            return;
        }
        System.out.println("正常完成下面的步骤");
    }
}
