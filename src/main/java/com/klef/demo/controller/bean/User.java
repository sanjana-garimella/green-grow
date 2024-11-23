package com.klef.demo.controller.bean;


public class User 
{
	private String cname;
	private String userId;
	
	private String password;
	
	private String rpassword;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [cname=" + cname + ", userId=" + userId + ", password=" + password + ", rpassword=" + rpassword
				+ "]";
	}

	
	
	

}
