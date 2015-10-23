package com.common.services;

import java.util.List;

import com.common.bean.Income;

public interface IIncomeServices {
	public boolean addIncome(Income Income);
	
	public boolean savrOrUpdateIncome(Income Income)
	;
	public boolean deleteIncome(Income Income)
	;
	public Income getIncomeById(Long id)
	;
	public List<Income> getAllByHql(String hql,Object[] obj)
	;
}
