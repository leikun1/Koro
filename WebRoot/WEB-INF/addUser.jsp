<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
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
    <center>
    	<form action="AddUserServlet" method="post">
    	用户名：<input type="text" name="uname"/>
    	密码：<input type="password" name="upwd"/>
    	<select name="select">
    		<option value="">请选择权限</option>
    		<option value="1">普通管理员</option>
    		<option value="2">内容审核员</option>
    	</select>
    	<input type="submit" value="添加用户" name="submit"/>
    	</form>
    </center>
  </body>
</html>
