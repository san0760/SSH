package com.san.domain;

import java.util.Set;

public class Department
{
	private int id;
	private String name;
	private Set<Employee> emps;//因为是部门对雇员是多对一，所以要做一个集合
	public Set<Employee> getEmps()
	{
		return emps;
	}
	public Department(){}
	public Department(String name)
	{
		this.name = name;
	}
	public void setEmps(Set<Employee> emps)
	{
		this.emps = emps;
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
}
