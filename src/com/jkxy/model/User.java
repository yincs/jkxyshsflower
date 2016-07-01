package com.jkxy.model;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String password;
	private String role;
	private Set guashis = new HashSet(0);
	private Set orderses = new HashSet(0);
	private Userdetail userdetail;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String password, String role, Set guashis,
			Set orderses, Userdetail userdetail) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.guashis = guashis;
		this.orderses = orderses;
		this.userdetail = userdetail;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set getGuashis() {
		return this.guashis;
	}

	public void setGuashis(Set guashis) {
		this.guashis = guashis;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Userdetail getUserdetail() {
		return this.userdetail;
	}

	public void setUserdetail(Userdetail userdetail) {
		this.userdetail = userdetail;
	}

}