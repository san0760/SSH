package com.san.interfaces;

import java.io.Serializable;
import java.util.List;

import com.san.basic.BasicServiceInterface;
import com.san.domain.Department;
import com.san.domain.Employee;

public interface EmployeeServiceInter extends BasicServiceInterface
{
	public Employee checkEmployee(Employee e);
	public List<Employee> ShowAllEmployeeByPage(int pageSize,int pageNow);
	public int getPageCount(int pageSize);
}
