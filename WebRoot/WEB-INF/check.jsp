<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'check.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function check(state){
			var id = document.getElementById("nid").value;
			window.location.href = "CheckServlet?nid="+id+"&nstate="+state+"";
		}
	</script>
  </head>
  
  <body>
    <center>
    	<strong>审核内容</strong><br>
    	<strong>${nvo.ntitle}</strong><br>
    	${nvo.ncontent}<br>
    	<input type="hidden" name="nid" id="nid" value="${nvo.nid}">
    	<input type="button" name="通过" value="通过" onclick="check(2)"/><input type="button" value="不通过" onClick="check(3);"/>
    </center>
  </body>
</html>
