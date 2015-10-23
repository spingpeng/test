package com.common.bean;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Long userId;
	private String userName;
	private String password;
	private Set<Logininfo> logininfos = new HashSet<Logininfo>(0);
	private Set payouts = new HashSet(0);
	private Set incomes = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Long userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	/** full constructor */
	public User(Long userId, String userName, String password, Set<Logininfo> logininfos,
			Set payouts, Set incomes) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.logininfos = logininfos;
		this.payouts = payouts;
		this.incomes = incomes;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Logininfo> getLogininfos() {
		return this.logininfos;
	}

	public void setLogininfos(Set<Logininfo> logininfos) {
		this.logininfos = logininfos;
	}

	public Set getPayouts() {
		return this.payouts;
	}

	public void setPayouts(Set payouts) {
		this.payouts = payouts;
	}

	public Set getIncomes() {
		return this.incomes;
	}

	public void setIncomes(Set incomes) {
		this.incomes = incomes;
	}

}