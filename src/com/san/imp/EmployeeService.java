package com.san.imp;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.san.domain.Department;
import com.san.domain.Employee;
import com.san.interfaces.EmployeeServiceInter;
@Transactional
public class EmployeeService implements EmployeeServiceInter
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public List<Employee> showEmployee()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updEmplpyee(Employee employee)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void delEmployee(Serializable id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void getEmployee(Serializable id)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public Employee checkEmployee(Employee e)
	{
		// TODO Auto-generated method stub
		String hql="from Employee where id=? and password=? ";
		List<Employee> l=sessionFactory.getCurrentSession().createQuery(hql).setString(0, e.getId()+"").
		setString(1, e.getPassword()).list();
		if(l.size()==1){
			return l.get(0);
		}else{
			return null;
		}
	}
}
