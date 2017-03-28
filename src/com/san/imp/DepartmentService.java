package com.san.imp;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.san.domain.Department;
import com.san.interfaces.DepartmentServiceInterface;
@Transactional
public class DepartmentService implements DepartmentServiceInterface
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addDepartment(Department department)
	{
		
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().save(department);
	}

}
