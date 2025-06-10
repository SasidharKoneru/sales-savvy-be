package com.salesSavvy.entity;

public class UserLoginData {
	String username;
	String password;
	public UserLoginData() {
		super();
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
	public UserLoginData(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLoginData [username=" + username + ", password=" + password + "]";
	}
}
