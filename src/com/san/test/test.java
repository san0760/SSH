package com.san.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.san.basic.BasicService;
import com.san.basic.BasicServiceInterface;
import com.san.domain.Department;
import com.san.domain.Employee;
import com.san.imp.EmployeeService;
import com.san.interfaces.DepartmentServiceInterface;
import com.san.interfaces.EmployeeServiceInter;

public class test
{
	static EmployeeServiceInter es=new EmployeeService();
	private static SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//用来测试Spring的东西
//			ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//			System.out.println(ac.getBean("test"));
		//用来测试数据的东西
//			Connection conn=null;
//			try
//			{
//				Class.forName("com.mysql.jdbc.Driver");
//				conn=DriverManager.getConnection("jdbc:mysql://120.25.236.235:3306/ssh1?user=root&password=root&useUnicode=true&characterEncoding=UTF8&useSSL=true");
//				System.out.println("OK");
//			} catch (ClassNotFoundException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e)
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//			DepartmentServiceInterface dsi=(DepartmentServiceInterface) ac.getBean("departmentService");
//			Employee e=new Employee("san","1","aaa@126.com",new Date(),300.11f);
//			Employee e2=new Employee("san2","1","aaa@126.com",new Date(),300.11f);
//			Employee e3=new Employee("san3","1","aaa@126.com",new Date(),300.11f);
//			Set<Employee> set=new HashSet<Employee>();
//			set.add(e);
//			set.add(e2);
//			set.add(e3);
//			Department d=new Department("Part1");
//			d.setEmps(set);
			
			
	}
	
}
