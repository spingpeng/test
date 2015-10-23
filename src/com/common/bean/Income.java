package com.common.bean;
// default package

import java.util.Date;

/**
 * Income entity. @author MyEclipse Persistence Tools
 */

public class Income implements java.io.Serializable {

	// Fields

	private Long incomeId;
	private User user;
	private String inkind;
	private Float inAccount;
	private Date inTime;
	private String remark;

	// Constructors

	/** default constructor */
	public Income() {
	}

	/** minimal constructor */
	public Income(Long incomeId, User user, String inkind, Float inAccount,
			Date inTime) {
		this.incomeId = incomeId;
		this.user = user;
		this.inkind = inkind;
		this.inAccount = inAccount;
		this.inTime = inTime;
	}

	/** full constructor */
	public Income(Long incomeId, User user, String inkind, Float inAccount,
			Date inTime, String remark) {
		this.incomeId = incomeId;
		this.user = user;
		this.inkind = inkind;
		this.inAccount = inAccount;
		this.inTime = inTime;
		this.remark = remark;
	}

	// Property accessors

	public Long getIncomeId() {
		return this.incomeId;
	}

	public void setIncomeId(Long incomeId) {
		this.incomeId = incomeId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getInkind() {
		return this.inkind;
	}

	public void setInkind(String inkind) {
		this.inkind = inkind;
	}

	public Float getInAccount() {
		return this.inAccount;
	}

	public void setInAccount(Float inAccount) {
		this.inAccount = inAccount;
	}

	public Date getInTime() {
		return this.inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}