package com.common.action;

import java.util.List;

import com.common.base.BaseObject;
import com.common.bean.Payout;
import com.common.services.IPayoutServices;

public class PayoutAction extends BaseObject {

	private IPayoutServices baseServices;
	private Payout payout;
	private List<Payout> list;

	public List<Payout> getList() {
		return list;
	}

	public void setList(List<Payout> list) {
		this.list = list;
	}

	public Payout getPayout() {
		return payout;
	}

	public void setPayout(Payout payout) {
		this.payout = payout;
	}

	public void setBaseServices(IPayoutServices baseServices) {
		this.baseServices = baseServices;
	}

	public String addPayout() {
		try {
			payout.setUser(super.getUser());
			if (baseServices.addPayout(payout)) {
				setMsg("添加支出情况成功");
				return SUCCESS;
			} else {
				setMsg("添加支出情况失败");
				return ERROR;
			}
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String getAll() {
		try {
			list = baseServices.getAllByHql("1=1", null);
			return SUCCESS;
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String updatePayout() {
		try {
			// payout.setUser(super.getUser());
			if (baseServices.savrOrUpdatePayout(payout)) {
				setMsg("更新支出情况成功");
				return SUCCESS;
			} else {
				setMsg("更新支出情况失败");
				return ERROR;
			}
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String deletePayout() {

		try {
			if (baseServices.deletePayout(payout)) {
				setMsg("删除支出情况成功");
				return SUCCESS;
			} else {
				setMsg("删除支出情况失败");
				return ERROR;
			}
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String toaddPayout() {
		payout = null;
		setMsg("添加");
		return SUCCESS;

	}

	public String toModifyPayout() {
		try {
			setMsg("修改");
			payout = baseServices.getPayoutById(payout.getPayoutId());
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

		return SUCCESS;

	}

}
