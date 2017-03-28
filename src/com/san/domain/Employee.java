package com.san.domain;

import java.util.Date;

public class Employee
{
	private int id;
	private String name;
	private String password;
	private String email;
	private Date hireDate;
	private float salary;
	private Department department;//一个雇员对应一个部门，所以要写部门属性啊
	public Department getDepartment()
	{
		return department;
	}
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	public Employee(){
		
	}
	public Employee(String name, String password, String email,
			Date hireDate, float salary)
	{
		this.name = name;
		this.password = password;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	public Employee(String name, String email, Date hireDate,float salary)
	{
		this.name = name;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public Date getHireDate()
	{
		return hireDate;
	}
	public void setHireDate(Date hireDate)
	{
		this.hireDate = hireDate;
	}
	public float getSalary()
	{
		return salary;
	}
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
}
