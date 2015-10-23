package com.common.services;

import java.util.List;

import com.common.bean.Payout;

public interface IPayoutServices {
	public boolean addPayout(Payout payout);
	
	public boolean savrOrUpdatePayout(Payout payout)
	;
	public boolean deletePayout(Payout payout)
	;
	public Payout getPayoutById(Long id)
	;
	public List<Payout> getAllByHql(String hql,Object[] obj)
	;
}
