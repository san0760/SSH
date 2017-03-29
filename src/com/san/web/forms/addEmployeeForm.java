package com.san.web.forms;

import java.util.Date;

import org.apache.struts.action.ActionForm;

import com.san.domain.Department;

public class addEmployeeForm extends ActionForm
{
	private int id;
	private String name;
	private String email;
	private Date hireDate;
	private float salary;
	private String password;
	private int department;
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
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public int getDepartment()
	{
		return department;
	}
	public void setDepartment(int department)
	{
		this.department = department;
	}
}
