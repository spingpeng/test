package com.common.services;

import java.util.List;

import com.common.bean.Logininfo;
import com.common.bean.User;

public interface IUserServices {
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> getUsers();
	public User getUsersByname(String userName);
	public boolean addLoginInfo(Logininfo info);
	public String getPayTotalCurrMoth(String moth);
	public String getIncomeTotalCurrMoth(String moth);
	public List<Logininfo> getUsersLogins();
}
