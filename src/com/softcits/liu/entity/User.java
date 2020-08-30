package com.softcits.liu.entity;

public class User {

	private String userid;
	private String username;
	private String userPassword;
	private String userAddress;
	private String userPhone;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public User(String userid, String username, String userPassword, String userAddress, String userPhone) {
		super();
		this.userid = userid;
		this.username = username;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userPassword=" + userPassword + ", userAddress="
				+ userAddress + ", userPhone=" + userPhone + "]";
	}
	
	
	
}
