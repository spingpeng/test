package com.common.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao {
	
	public Object getObjectById(Class cls,Serializable id);
	public List getListByHql(String queryString,Object ... parms);
	public String getOveValue(String sql,String ... parms);
	public boolean insertObject(Serializable entity);
	public boolean UpdateObject(Serializable entity);
	public boolean SaveOrUpdateObject(Serializable entity);
	public boolean deleteObject(Serializable entity,Serializable id);
	public List getAllList(Class cls);
}
