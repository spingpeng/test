package com.common.services;

import java.util.List;

import com.common.base.IBaseDao;
import com.common.bean.Income;
import com.common.bean.Payout;

public class IncomeServices implements IIncomeServices {
	private IBaseDao baseDao;

	public IBaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(IBaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public boolean addIncome(Income income)
	{
		return baseDao.insertObject(income);
	}
	public boolean savrOrUpdateIncome(Income Income)
	{
		return baseDao.SaveOrUpdateObject(Income);
	}
	public boolean deleteIncome(Income Income)
	{
		return baseDao.deleteObject(Income,Income.getIncomeId());
	}
	public Income getIncomeById(Long id)
	{
		return (Income)baseDao.getObjectById(Income.class, id);
	}
	public List<Income> getAllByHql(String hql,Object[] obj)
	{
		return baseDao.getListByHql("from Income where "+hql, obj);
	}

}
