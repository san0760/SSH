package com.san.basic;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public abstract class BasicService implements BasicServiceInterface
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	@Override
	public Object findById(Class clazz, Serializable id)
	{
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(clazz, id);
	}

	@Override
	public List excuteQuery(String hql, Object[] parameters)
	{
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}

	@Override
	public List excuteQueryByPage(String hql, Object[] parameters, int pageNow,
			int pageSize)
	{
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		query.setFirstResult((pageNow-1)*pageSize);
		query.setMaxResults(pageSize);
		return query.list();
	}
	
	@Override
	public void add(Object obj)
	{
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void excuteUpdate(String hql, Object[] parameters)
	{
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
	}
	@Override
	public Object uniqueQuery(String hql, Object[] parameters)
	{
		// TODO Auto-generated method stub
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		if(parameters!=null&&parameters.length>0){
			for(int i=0;i<parameters.length;i++){
				query.setParameter(i, parameters[i]);
			}
		}
		return query.uniqueResult();
	}
	@Override
	public int queryPageCount(String hql, Object[] parameters, int pageSize)
	{
		// TODO Auto-generated method stub
		int rowCount=Integer.parseInt(this.uniqueQuery(hql, parameters).toString());
		return (rowCount-1)/pageSize+1;
	}
	
}
