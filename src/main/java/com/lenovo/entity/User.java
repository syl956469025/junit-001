package com.lenovo.entity;
/**
 * @description 
 * @author 史彦磊
 * @version 1.0
 *  2015年1月8日
 */
public class User {
	
	String username;
	String password;
	String nickname;
	public User() {
		super();
	}
	public User(String username, String password, String nickname) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	

}
