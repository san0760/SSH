package com.san.basic;

import java.io.Serializable;
import java.util.List;

public interface BasicServiceInterface
{
	public Object findById(Class clazz,Serializable id);
	//查单个对象
	public List excuteQuery(String hql,Object [] parameters);
	//按语句查询
	public List excuteQueryByPage(String hql,Object [] parameters,int pageNow,int pageSize);
	//按语句查询，带分页功能
	public void add(Object obj);
	//添加一个对象
	public void excuteUpdate(String hql,Object [] parameters);
	//执行修改、删除等指令
	public Object uniqueQuery(String hql,Object [] parameters);
	//
	public int queryPageCount(String hql,Object [] parameters,int pageSize);
}
