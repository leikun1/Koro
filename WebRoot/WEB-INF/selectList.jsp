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
    
    <title>My JSP 'selectList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function jump(obj){
			var id = obj.value;
			window.location.href = "SelectListServlet?ncid="+id+"";
		}
		function update(id){
			window.location.href = "UpdateNewsServlet?nid="+id+"";
		}
	</script>
  </head>
  
  <body>
    <center>
    	<select name="select" onchange="javascript:jump(this)">
        	<option>请选择分类</option>
            	<c:forEach items="${lst}" var="ncvo">
                	<option value="${ncvo.ncid}">${ncvo.ncname}</option>
                </c:forEach>         
         </select><br>
         <c:forEach items="${lst1}" var="nvvo">
         	${nvvo.ntitle}<input type="button" value="编辑" onclick="update(${nvvo.nid})"><br>
         </c:forEach>
    </center>
  </body>
</html>
