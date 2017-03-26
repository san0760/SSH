package com.san.web.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.san.web.forms.EmployeeForm;


public class LoginAction extends DispatchAction
{
	public ActionForward login(ActionMapping arg0, ActionForm arg1,
			ServletRequest arg2, ServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		EmployeeForm employeeForm=(EmployeeForm) arg1;
		if(employeeForm.getPassword().equals("123")){
			return arg0.findForward("ok");
		}else{
			return arg0.findForward("err");
		}
		
	}
}
