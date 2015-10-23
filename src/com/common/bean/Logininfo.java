package com.common.bean;
// default package

import java.util.Date;

/**
 * Logininfo entity. @author MyEclipse Persistence Tools
 */

public class Logininfo implements java.io.Serializable {

	// Fields

	private Long loginId;
	private User user;
	private Date loginTime;

	// Constructors

	/** default constructor */
	public Logininfo() {
	}

	/** full constructor */
	public Logininfo(Long loginId, User user, Date loginTime) {
		this.loginId = loginId;
		this.user = user;
		this.loginTime = loginTime;
	}

	// Property accessors

	public Long getLoginId() {
		return this.loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

}