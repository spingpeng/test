package com.common.bean;
// default package

import java.util.Date;

/**
 * Payout entity. @author MyEclipse Persistence Tools
 */

public class Payout implements java.io.Serializable {

	// Fields

	private Long payoutId;
	private User user;
	private String paykind;
	private Float payAccount;
	private Date payTime;
	private String remark;
	

	// Constructors

	/** default constructor */
	public Payout() {
	}

	/** minimal constructor */
	public Payout(Long payoutId, User user, String paykind, Float payAccount,
			Date payTime) {
		this.payoutId = payoutId;
		this.user = user;
		this.paykind = paykind;
		this.payAccount = payAccount;
		this.payTime = payTime;
	}

	/** full constructor */
	public Payout(Long payoutId, User user, String paykind, Float payAccount,
			Date payTime, String remark) {
		this.payoutId = payoutId;
		this.user = user;
		this.paykind = paykind;
		this.payAccount = payAccount;
		this.payTime = payTime;
		this.remark = remark;
	}

	// Property accessors

	public Long getPayoutId() {
		return this.payoutId;
	}

	public void setPayoutId(Long payoutId) {
		this.payoutId = payoutId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPaykind() {
		return this.paykind;
	}

	public void setPaykind(String paykind) {
		this.paykind = paykind;
	}

	public Float getPayAccount() {
		return this.payAccount;
	}

	public void setPayAccount(Float payAccount) {
		this.payAccount = payAccount;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}