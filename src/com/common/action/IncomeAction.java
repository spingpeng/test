package com.common.action;

import java.util.List;

import com.common.base.BaseObject;
import com.common.bean.Income;
import com.common.services.IIncomeServices;

public class IncomeAction extends BaseObject {

	private IIncomeServices baseServices;
	private Income income;
	private List<Income> list;

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}

	public List<Income> getList() {
		return list;
	}

	public void setList(List<Income> list) {
		this.list = list;
	}

	public void setBaseServices(IIncomeServices baseServices) {
		this.baseServices = baseServices;
	}

	public String addIncome() {
		try {
			income.setUser(super.getUser());
			if (baseServices.addIncome(income)) {
				setMsg("添加收入情况成功");
				return SUCCESS;
			} else {
				setMsg("添加收入情况失败");
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

	public String updateIncome() {
		try {
			// Income.setUser(super.getUser());
			if (baseServices.savrOrUpdateIncome(income)) {
				setMsg("更新收入情况成功");
				return SUCCESS;
			} else {
				setMsg("更新收入情况失败");
				return ERROR;
			}
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String deleteIncome() {

		try {
			if (baseServices.deleteIncome(income)) {
				setMsg("删除收入情况成功");
				return SUCCESS;
			} else {
				setMsg("删除收入情况失败");
				return ERROR;
			}
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

	}

	public String toaddIncome() {
		income = null;
		setMsg("添加");
		return SUCCESS;

	}

	public String toModifyIncome() {
		try {
			setMsg("修改");
			income = baseServices.getIncomeById(income.getIncomeId());
		} catch (Exception e) {
			setMsg(e.getMessage());
			return ERROR;
		}

		return SUCCESS;

	}
}
