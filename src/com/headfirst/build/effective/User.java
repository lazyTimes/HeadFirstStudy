package com.headfirst.build.effective;

/**
 * @author zhaoxudong
 * @version v1.0.0
 * @Package : com.headfirst.build.effective
 * @Description : 系统用户对象
 * @Create on : 2021/10/29 16:35
 **/
public class User {

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

    /**
     * 商户号
     */
    private String merchNo;
    /**
     * 用户名
     */
    private String userName;

    /**
     *用户真实姓名
     */
    private String userRealName;
    /**
     * 密码
     */
    private String userPwd;
    /**
     * 新密码
     */
    private String userPwdNew;
    /**
     * 确认密码
     */
    private String userPwdRepeat;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态(0：禁用   1：正常)
     */
    private String status;

    public User(String userId, String orgId, String orgName, String merchNo, String userName, String userRealName, String userPwd) {
        this.userId = userId;
        this.orgId = orgId;
        this.orgName = orgName;
        this.merchNo = merchNo;
        this.userName = userName;
        this.userRealName = userRealName;
        this.userPwd = userPwd;
    }

    public User(String userId, String orgId, String orgName, String merchNo, String userName, String userRealName, String userPwd, String userPwdNew, String userPwdRepeat, String email, String mobile, String status) {
        this.userId = userId;
        this.orgId = orgId;
        this.orgName = orgName;
        this.merchNo = merchNo;
        this.userName = userName;
        this.userRealName = userRealName;
        this.userPwd = userPwd;
        this.userPwdNew = userPwdNew;
        this.userPwdRepeat = userPwdRepeat;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getMerchNo() {
        return merchNo;
    }

    public void setMerchNo(String merchNo) {
        this.merchNo = merchNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserPwdNew() {
        return userPwdNew;
    }

    public void setUserPwdNew(String userPwdNew) {
        this.userPwdNew = userPwdNew;
    }

    public String getUserPwdRepeat() {
        return userPwdRepeat;
    }

    public void setUserPwdRepeat(String userPwdRepeat) {
        this.userPwdRepeat = userPwdRepeat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
