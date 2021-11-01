package com.headfirst.build.effective;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.build.effective
 * @Description : 用户构建器
 * @Create on : 2021/10/29 17:26
 **/
public class UserBuilder {

    /**
     * 用户id
     */
    private final String userId;

    /**
     * 机构id
     */
    private final String orgId;

    /**
     * 机构名称
     */
    private final String orgName;

    public static class Builder {
        /**
         * 用户id
         */
        private String userId;

        /**
         * 机构id
         */
        private String orgId;

        /**
         * 机构名称
         */
        private String orgName;

        public Builder(String userId, String orgId, String orgName) {
            this.userId = userId;
            this.orgId = orgId;
            this.orgName = orgName;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder orgId(String orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder orgName(String orgName) {
            this.orgName = orgName;
            return this;
        }

        public UserBuilder build(){
            return new UserBuilder(this);
        }
    }

    private UserBuilder(Builder builder) {
        this.userId = builder.userId;
        this.orgId = builder.orgId;
        this.orgName = builder.orgName;
    }
}
