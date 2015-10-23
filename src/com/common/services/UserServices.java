package com.common.services;

import java.util.List;

import com.common.base.IBaseDao;
import com.common.bean.Logininfo;
import com.common.bean.User;

public class UserServices implements IUserServices {
	private IBaseDao baseDao;

	public IBaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public boolean addUser(User user) {
		
		return baseDao.SaveOrUpdateObject(user);
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return baseDao.deleteObject(user,user.getUserId());
	}

	public List<User> getUsers() {
		
		return baseDao.getAllList(User.class);
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return baseDao.UpdateObject(user);
	}

	public User getUsersByname(String userName) {
		List<User> user=baseDao.getListByHql("from User where userName=?", new Object[]{userName});
		if(user!=null&&user.size()>0)
		{
			return user.get(0);
		}
		return null;
	}
	public boolean addLoginInfo(Logininfo info)
	{
		return baseDao.insertObject(info);
	
	}
	public String getPayTotalCurrMoth(String moth)
	{
		return baseDao.getOveValue("select concat(sum(PayAccount),'') aa from payout where date_format(payTime,'%Y%c')=?",new String[]{moth});
	}
	public String getIncomeTotalCurrMoth(String moth)
	{
		return baseDao.getOveValue("select concat(sum(inAccount),'') aa from income where date_format(Intime,'%Y%c')=?",new String[]{moth});
	
		
	}
	public List<Logininfo> getUsersLogins() {
		
		return baseDao.getAllList(Logininfo.class);
	}


}
