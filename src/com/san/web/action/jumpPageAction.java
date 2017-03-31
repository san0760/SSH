package com.san.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.san.imp.EmployeeService;
import com.san.interfaces.EmployeeServiceInter;


public class jumpPageAction extends DispatchAction
{
	EmployeeServiceInter es;
	public void setEs(EmployeeServiceInter es)
	{
		this.es = es;
	}

	public ActionForward jumpToAddEmployee(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		return arg0.findForward("ok");
	}

	public ActionForward jumpToShowEmployee(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		arg2.getParameter("pageNow");
		int pageNow=1;
		if(arg2.getParameter("pageNow")!=null){
			pageNow=Integer.parseInt(arg2.getParameter("pageNow"));
		}
		arg2.setAttribute("EList",es.ShowAllEmployeeByPage(2, pageNow));
		arg2.setAttribute("pageCount",es.getPageCount(2));
		return arg0.findForward("jumpToShowEmployee");
	}
}
