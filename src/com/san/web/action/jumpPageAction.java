package com.san.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class jumpPageAction extends DispatchAction
{
	public ActionForward jumpToAddEmployee(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception
	{
		// TODO Auto-generated method stub
		return arg0.findForward("ok");
	}
}
