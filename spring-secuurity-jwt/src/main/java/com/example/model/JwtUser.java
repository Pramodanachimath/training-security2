package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class JwtUser {

	@Column(unique = true)
	private String username;
	private String password;
	@Id
	@GeneratedValue
	private Integer userId;
	
	public JwtUser() {
		super();
	}

	public JwtUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "jwtUser [username=" + username + ", password=" + password + ", userId=" + userId + "]";
	}
	
	
	
 }
