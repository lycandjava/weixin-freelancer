package com.todotask.platform.model;

import java.util.Date;

import net.sf.json.JSONObject;

import com.todotask.platform.model.support.JsonSupport;

public class User implements JsonSupport{

	private String id;
	private String username;
	private String password;
	private String fullname;
	private String sex;
	private String idCard;
	private Date birthday;

	private String education;
	private String address;
	private String phone;
	private String email;
	private String qq;
	private String weixin;
	private Date createDate;
	private String userType;
	private String sourceSystem;
	private String remark;
 
	
	public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    public String getFullname() {
        return fullname;
    }



    public void setFullname(String fullname) {
        this.fullname = fullname;
    }



    public String getSex() {
        return sex;
    }



    public void setSex(String sex) {
        this.sex = sex;
    }



    public String getIdCard() {
        return idCard;
    }



    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }



    public Date getBirthday() {
        return birthday;
    }



    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    @Override
	public String toJson() {
		JSONObject jsonObject = JSONObject.fromObject(this);
		return jsonObject.toString();
	}



    public String getEducation() {
        return education;
    }



    public void setEducation(String education) {
        this.education = education;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getPhone() {
        return phone;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getQq() {
        return qq;
    }



    public void setQq(String qq) {
        this.qq = qq;
    }



    public String getWeixin() {
        return weixin;
    }



    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }



    public Date getCreateDate() {
        return createDate;
    }



    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    public String getUserType() {
        return userType;
    }



    public void setUserType(String userType) {
        this.userType = userType;
    }



    public String getSourceSystem() {
        return sourceSystem;
    }



    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }



    public String getRemark() {
        return remark;
    }



    public void setRemark(String remark) {
        this.remark = remark;
    }
}
