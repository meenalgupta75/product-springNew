package com.cts.product.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Login")
@Table(name="login_table")
public class Login {

	public Login() {
		super();
	}

	@Id
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login(String userName2, String password2) {
		
		this.password=password2;
		this.userName=userName2;
		// TODO Auto-generated constructor stub
	}
}
