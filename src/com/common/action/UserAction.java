package com.common.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.common.base.BaseObject;
import com.common.bean.Logininfo;
import com.common.bean.User;
import com.common.services.IUserServices;

public class UserAction extends BaseObject {

	private IUserServices baseServices;
	private User user2;
	private String payTotal;
	private String inTotal;
	public List<User> list;
	public List<Logininfo> listinfo;

	public List<Logininfo> getListinfo() {
		return listinfo;
	}

	public void setListinfo(List<Logininfo> listinfo) {
		this.listinfo = listinfo;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public String getPayTotal() {
		return payTotal;
	}

	public void setPayTotal(String payTotal) {
		this.payTotal = payTotal;
	}

	public String getInTotal() {
		return inTotal;
	}

	public void setInTotal(String inTotal) {
		this.inTotal = inTotal;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public void setBaseServices(IUserServices baseServices) {
		this.baseServices = baseServices;
	}

	public String login() {
		try {
			String password = super.getUser().getPassword();
			super.setUser(baseServices.getUsersByname(super.getUser()
					.getUserName()));
			if (super.getUser() != null) {
				if (super.getUser().getPassword().equals(password)) {

					Logininfo info = new Logininfo();
					info.setUser(super.getUser());
					info.setLoginTime(new Date());
					if (baseServices.addLoginInfo(info)) {
						super.setMsg("登录成功！");
						getSession().put("user", super.getUser());
						return SUCCESS;
					} else {
						super.setMsg("插入登录日志失败！");
						return ERROR;
					}

				} else {
					super.setMsg("密码错误！");
					return ERROR;
				}
			} else {
				super.setMsg("用户不存在！");
				return ERROR;
			}
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String right() {
		try {
			SimpleDateFormat fomat = new SimpleDateFormat("yyyyM");
			String temp = baseServices.getPayTotalCurrMoth(fomat
					.format(new Date()));
			System.out.println(fomat.format(new Date()));
			if (temp != null) {
				payTotal = temp;
			} else {
				payTotal = "0.00";
			}

			temp = baseServices
					.getIncomeTotalCurrMoth(fomat.format(new Date()));
			if (temp != null) {
				inTotal = temp;
			} else {
				inTotal = "0.00";
			}
		} catch (Exception e) {
			e.printStackTrace();
			setMsg("查询失败！请稍候重试。");
			return ERROR;
		}

		return SUCCESS;
	}

	public String exit() {
		getSession().remove("user");
		setMsg("退出成功！");
		return SUCCESS;
	}

	public String addUser() {
		try {
			if (user2.getUserName().equals(null)
					|| user2.getUserName().equals("")) {
				setMsg("用户名不能为空");
				return ERROR;
			}

			if (user2.getPassword().equals(null)
					|| user2.getPassword().equals("")) {
				setMsg("密码不能为空");
				return ERROR;
			}

			if (baseServices.getUsersByname(user2.getUserName()) == null) {
				if (baseServices.addUser(user2)) {
					setMsg("添加用户成功");
					return SUCCESS;
				} else {
					setMsg("添加用户失败");
					return ERROR;
				}

			} else {
				setMsg("用户已存在!");
				return ERROR;
			}

		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String modifyUser() {
		try {

			if (user2.getUserName().equals(null)
					|| user2.getUserName().equals("")) {
				setMsg("用户名不能为空");
				return ERROR;
			}

			if (user2.getPassword().equals(null)
					|| user2.getPassword().equals("")) {
				setMsg("密码不能为空");
				return ERROR;
			}

			if (baseServices.addUser(user2)) {
				setMsg("修改用户成功");
				return SUCCESS;
			} else {
				setMsg("修改用户失败");
				return ERROR;
			}

		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String getAll() {
		list = baseServices.getUsers();
		return SUCCESS;
	}

	public String toAddUser() {
		user2 = null;
		setMsg("添加");
		return SUCCESS;
	}

	public String toModifyUser() {
		setMsg("修改");
		user2 = baseServices.getUsersByname(user2.getUserName());
		return SUCCESS;
	}

	public String deleteUser() {
		try {
			baseServices.deleteUser(user2);
		} catch (Exception e) {
			setMsg("删除失败");
			return ERROR;
		}
		return SUCCESS;
	}

	public String listUserLogin() {
		try {
			listinfo = baseServices.getUsersLogins();
		} catch (Exception e) {
			setMsg("查询失败");
			return ERROR;
		}
		return SUCCESS;
	}

}
