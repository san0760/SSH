package com.san.web.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.san.domain.Employee;
import com.san.interfaces.EmployeeServiceInter;
import com.san.web.forms.EmployeeForm;


public class LoginAction extends DispatchAction
{
	
	public ActionForward login(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext
				(this.getServlet().getServletContext());
		EmployeeServiceInter es=(EmployeeServiceInter) wac.getBean("employeeService");
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		EmployeeServiceInter es=(EmployeeServiceInter) ac.getBean("employeeService");
		EmployeeForm employeeForm=(EmployeeForm) arg1;
		Employee e=new Employee();
		e.setId(Integer.parseInt(employeeForm.getId()));
		e.setPassword(employeeForm.getPassword());
		e=es.checkEmployee(e);
		if(e!=null){
			arg2.getSession().setAttribute("loginUser", e);
			return arg0.findForward("ok");
		}else{
			return arg0.findForward("err");
		}
	}
	
}
