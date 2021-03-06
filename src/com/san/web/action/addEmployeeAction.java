package com.san.web.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.san.domain.Department;
import com.san.domain.Employee;
import com.san.interfaces.DepartmentServiceInterface;
import com.san.interfaces.EmployeeServiceInter;
import com.san.web.forms.addEmployeeForm;

public class addEmployeeAction extends DispatchAction
{
	EmployeeServiceInter es;
	DepartmentServiceInterface ds;
	public void setEs(EmployeeServiceInter es)
	{
		this.es = es;
	}
	public void setDs(DepartmentServiceInterface ds)
	{
		this.ds = ds;
	}
	@Override
	public ActionForward execute(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		addEmployeeForm aef=(addEmployeeForm) arg1;
		Employee e=new Employee();
		e.setName(aef.getName());
		e.setEmail(aef.getEmail());
		e.setHireDate(new Date());
		e.setPassword(aef.getPassword());
		e.setSalary(aef.getSalary());
		e.setDepartment((Department)ds.findById(Department.class, Integer.parseInt(arg2.getParameter("department_id"))));
		es.add(e);
		return arg0.findForward("ok");
	}
}
