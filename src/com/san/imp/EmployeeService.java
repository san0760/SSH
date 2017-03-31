package com.san.imp;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.san.basic.BasicService;
import com.san.domain.Department;
import com.san.domain.Employee;
import com.san.interfaces.EmployeeServiceInter;

public class EmployeeService extends BasicService implements EmployeeServiceInter
{
	
	
	@Override
	public Employee checkEmployee(Employee e)
	{
		// TODO Auto-generated method stub
		String hql="from Employee where id=? and password=? ";
		Object [] parameters={e.getId(),e.getPassword()};
		List<Employee> l=excuteQuery(hql, parameters);
		if(l.size()==1){
			return l.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<Employee> ShowAllEmployeeByPage(int pageSize, int pageNow)
	{
		// TODO Auto-generated method stub
		String hql="from Employee";
		return excuteQueryByPage(hql, null,pageNow,pageSize);
	}
	public int getPageCount(int pageSize){
		String hql="select count(*) from Employee";
		return this.queryPageCount(hql, null, pageSize);
	}
	
}
