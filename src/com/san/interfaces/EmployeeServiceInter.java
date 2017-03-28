package com.san.interfaces;

import java.io.Serializable;
import java.util.List;

import com.san.domain.Department;
import com.san.domain.Employee;

public interface EmployeeServiceInter
{
	public void addEmployee(Employee employee);
	public List<Employee> showEmployee();
	public void updEmplpyee(Employee employee);
	public void delEmployee(Serializable id);
	public void getEmployee(Serializable id);
	public Employee checkEmployee(Employee e);
}
