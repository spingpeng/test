package com.common.base;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDaoImpl implements IBaseDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public Object getObjectById(Class cls,Serializable id)
	{
		return hibernateTemplate.get(cls, id);		
	}
	
	public List getListByHql(String queryString,Object ... parms)
	{		
		return hibernateTemplate.find(queryString, parms);		
	}
	public String getOveValue(String sql,String ... parms)
	{
		  final String sqlTemp = sql; 
		  final String[] temp=parms;		  
		  return (String)hibernateTemplate.execute(new HibernateCallback() {    
		    public Object doInHibernate(Session session) throws HibernateException, SQLException {    
		          SQLQuery query = session.createSQLQuery(sqlTemp);      
		     for (int i = 0; i < temp.length; i++) {
				query.setString(i, temp[i]);
			}
		    return query.uniqueResult();
		             }    
		         });   	
	}
	
	public boolean insertObject(Serializable entity)
	{
		try {
			hibernateTemplate.persist(entity);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public boolean UpdateObject(Serializable entity)
	{
		try {
			hibernateTemplate.merge(entity);
		} catch (Exception e) {
			return false;
		}
		return true;		
	}
	public boolean SaveOrUpdateObject(Serializable entity)
	{
		try {
			hibernateTemplate.saveOrUpdate(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;		
	}
	public boolean deleteObject(Serializable entity,Serializable id)
	{
		try {
			hibernateTemplate.load(entity, id);
			hibernateTemplate.delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;	
	}
	public List getAllList(Class cls)
	{
		return hibernateTemplate.loadAll(cls);
	}
}
