<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
request.setCharacterEncoding("UTF-8");
String htmlData = request.getParameter("content1") != null ? request.getParameter("content1") : "";
%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<title>KindEditor JSP</title>
	<link rel="stylesheet" href="kindeditor/kindeditor-4.1.10/themes/default/default.css" />
	<link rel="stylesheet" href="kindeditor/kindeditor-4.1.10/plugins/code/prettify.css" />
	<script charset="utf-8" src="kindeditor/kindeditor-4.1.10/kindeditor.js"></script>
	<script charset="utf-8" src="kindeditor/kindeditor-4.1.10/lang/zh_CN.js"></script>
	<script charset="utf-8" src="kindeditor/kindeditor-4.1.10/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="content1"]', {
				cssPath : 'kindeditor/kindeditor-4.1.10/plugins/code/prettify.css',
				uploadJson : 'kindeditor/kindeditor-4.1.10/jsp/upload_json.jsp',
				fileManagerJson : 'kindeditor/kindeditor-4.1.10/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['example'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
</head>
<body>

	
	<form name="example" method="post" action="AddNewsServlet">
	标题:<input type="text" name="title"/>
		<textarea name="content1" cols="100" rows="8" style="width:770px;height:400px;visibility:hidden;"><%=htmlspecialchars(htmlData)%></textarea>
		<br />
		<select name="select">
        	<option>请选择分类</option>
            	<c:forEach items="${lst}" var="ncvo">
                	<option value="${ncvo.ncid}">${ncvo.ncname}</option>
                </c:forEach>         
         </select>
         信息来源：<input type="text" name="nsource"/>
		<input type="submit" name="button" value="提交内容" /> (提交快捷键: Ctrl + Enter)<a href="ManagerServlet">管理内容</a>&nbsp;&nbsp;
		<a href="ManagerTec">管理师资队伍</a>&nbsp;&nbsp;<a href="SelectListServlet">内容分类显示</a>&nbsp;&nbsp;<a href="UserServlet">用户管理</a>
	</form>
	
</body>
</html>
<%!
private String htmlspecialchars(String str) {
	str = str.replaceAll("&", "&amp;");
	str = str.replaceAll("<", "&lt;");
	str = str.replaceAll(">", "&gt;");
	str = str.replaceAll("\"", "&quot;");
	return str;
}
%>