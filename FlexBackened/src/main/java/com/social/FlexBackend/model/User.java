package com.social.FlexBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {


	@Id
	@GeneratedValue
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_id")
	private int id;
	@Column(name="User_Firstname")
	private String firstname;
	@Column(name="User_Lastname")
	private String lasrname;
	@Column(name="User_Email")
	private String email;
	@Column(name="User_Password")
	private String password;
	@Column(name="User_Role")
	private String role;
	@Column(name="User_enabled")
	private boolean enabled;
	@Column(name="User_isOnline")
	private String isOnline;
	public String getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLasrname() {
		return lasrname;
	}
	public void setLasrname(String lasrname) {
		this.lasrname = lasrname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
