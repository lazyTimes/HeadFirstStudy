package com.headfirst.build.effective;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.build.effective
 * @Description : 建造者模式的测试
 * @Create on : 2021/10/29 16:36
 **/
public class Main {

    public static void main(String[] args) {
        AbstractUser.Builder build = new ConcreteUser.ConcreteBuilder(AbstractUser.NATURE.LIVELY).build();
        AbstractUser process = build.process();


    }

    private static void test1() {
        User user = new User("xx","xx","xx","xx","xx","xx","xx");
        user.setUserId("");
        user.setOrgId("");
        user.setOrgName("");
        user.setMerchNo("");
        user.setUserName("");
        user.setUserRealName("");
        user.setUserPwd("");
        user.setUserPwdNew("");
        user.setUserPwdRepeat("");
        user.setEmail("");
        user.setMobile("");
        user.setStatus("");
    }
}
