package com.common.services;

import java.util.List;

import com.common.base.IBaseDao;
import com.common.bean.Logininfo;
import com.common.bean.Payout;
import com.common.bean.User;

public class PayoutServices implements IPayoutServices {
	private IBaseDao baseDao;

	public IBaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public boolean addPayout(Payout payout)
	{
		return baseDao.insertObject(payout);
	}
	public boolean savrOrUpdatePayout(Payout payout)
	{
		return baseDao.SaveOrUpdateObject(payout);
	}
	public boolean deletePayout(Payout payout)
	{
		return baseDao.deleteObject(payout,payout.getPayoutId());
	}
	public Payout getPayoutById(Long id)
	{
		return (Payout)baseDao.getObjectById(Payout.class, id);
	}
	public List<Payout> getAllByHql(String hql,Object[] obj)
	{
		return baseDao.getListByHql("from Payout where "+hql, obj);
	}

}
