package com.san.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.san.domain.Employee;

public class test
{

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
			ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
			SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
			Session s=sf.openSession();
			Employee e=new Employee("bb","bb@126.com",new Date(),200.11f);
			Transaction ts=s.beginTransaction();
			s.save(e);
			ts.commit();
	}

}