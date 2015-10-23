package com.common.base;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.common.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class BaseObject extends ActionSupport implements RequestAware,
		SessionAware, IBaseObject {

	private Map<String, Object> request;
	private Map<String, Object> session;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// 提示信息字段，通过设置该值，显示于页面。
	private String msg;

	private Map<String, String> etaoData;

	public Map<String, String> getEtaoData() {
		return etaoData;
	}

	public void setEtaoData(Map<String, String> etaoData) {
		this.etaoData = etaoData;
	}

	public String toReturnSuccess() {
		return SUCCESS;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;

	}

	public Map<String, Object> getSession() {
		return session;
	}

}
