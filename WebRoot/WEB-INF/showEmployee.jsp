<%@page import="com.san.domain.Employee"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	List<Employee> l=(List)request.getAttribute("EList");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showEmployee.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <body>
  	<table>
  		<tr><th>id</th><th>name</th><th>email</th><th>hireDate</th><th>salary</th><th>password</th><th>Department</th></tr>
  		<%
  			for(int i=0;i<l.size();i++){
  				Employee e=l.get(i);
  		 %>
  		 <tr><td><%=e.getId() %></td><td><%=e.getName() %></td><td><%=e.getEmail() %></td><td><%=e.getHireDate() %></td><td><%=e.getSalary() %></td><td><%=e.getPassword() %></td><td><%=e.getDepartment().getName() %></td></tr>
  		<%} %>
  	</table>
 	<c:forEach var="i" begin="1" end="${pageCount}">
 		<a href="/SSH/jumpPage.do?flag=jumpToShowEmployee&pageNow=${i}">${i}</a>
 	</c:forEach>
  </body>
</html>
