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
    
    <title>My JSP 'xyh.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

 <link href="css/lrtk.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="js/koala.min.1.5.js"></script>
	<script type="text/JavaScript" src="js/curvycorners.src.js"></script>
	
	<script type="text/javascript">
		function jump(obj)
			{
    		if(obj.value == ""){return false;}
    		else{window.open(obj.value);}
			}
	</script>
	
	<style type="text/css">
	body{
		margin-top:0px;
		}
	.dBody{
		width:980px;
		height:1000px;
		}
	.dTop{
		width:980px;
		height:100px;
		background-image:url(images/1a.jpg);
		}
	.dNav{
		widows:980px;
		height:30px;
		background-image:url(images/nav.jpg);
		}
	.dMid{
		width:980px;
		height:660px;
		}
			.dLeft{
				width:195px;
				height:660px;
				float:left;
				}
					.dlTop{
						width:195px;
						height:210px;
						background-image:url(images/nav_01.jpg);
						}
						
						.dlTop .dltTop{
							width:195px;
							height:30px;
							}
						.dlTop .dltBottom{
							width:195px;
							height:180px;
							}
					.dlMid{
						width:195px;
						height:280px;
						}
					.dlBottom{
						width:195px;
						height:170px;
						background-image:url(images/yqlj.jpg);
						}
						.dlBottom .sel{
							margin-top:32px;
							width:140px;
							}
			.dRight{
				width:775px;
				height:660px;
				float:left;
				border: 1px solid #959afe;
				}
				.drTop{
					width:775px;
					height:125px;
					}
				.drMid{
					width:775px;
					height:515px;
					}
				.drBottom{
					width:775px;
					height:30px;
					}
	.dBottom{
		width:980px;
		height:100px;
		background-image:url(images/4a.jpg);
		}
	.notice a{
		display:block;
		white-space:nowrap;
		overflow:hidden; 
		text-overflow:ellipsis;
		color:#000000;
		padding-top:8px;
		line-height:30px;
		margin-right:160px;
		}
	.menu {
font-family: arial, sans-serif; 
width:1000px; 
margin:0; 
margin:0px 0;
}

.menu ul {
padding:0; 
margin:0;
list-style-type: none;
z-index:10;
}

.menu ul li {
float:left; 
position:relative;
}

.menu ul li a, .menu ul li a:visited {
display:block; 
text-align:center; 
text-decoration:none; 
width:80px; 
height:35px; 
color:#000;/*导航条目字体颜色*/ 

line-height:30px; 
font-size:10pt;
}

.menu ul li ul {
display: none;
}

.menu ul li:hover a {
color:#fff; 
background:#035885;
}

.menu ul li:hover ul {
display:block; 
position:absolute; 
top:31px; 
left:0; 
width:105px;
}

.menu ul li:hover ul li a {
display:block; 
background:#ffffff; 
color:#000;
}

.menu ul li:hover ul li a:hover {
background:#035885;
color:#000;
}
</style>
<!--[if lte IE 6]>
<style type="text/css">

table {
border-collapse:collapse;
margin:0; 
padding:0;
}

.menu ul li a.hide, .menu ul li a:visited.hide {
display:none;
}

.menu ul li a:hover {
color:#fff; 
background:#b3ab79;
}

.menu ul li a:hover ul {
display:block; 
position:absolute; 
top:32px; 
left:0; 
width:105px;
}

.menu ul li a:hover ul li a {
background:#faeec7; 
color:#000;
}

.menu ul li a:hover ul li a:hover {
background:#dfc184; 
color:#000;
}
</style>
<![endif]-->
  </head>
  
  <body>
    <center>
	<div class="dBody">
    	<div class="dTop">
            <div style="padding-top:12px; margin-left:900px;">
            	<a href="http://www.wtu.edu.cn/" style="text-decoration:none; color:#0b3162; font-size:11pt;" target="_blank">学校首页</a>
            </div>
        </div>
        <div class="dNav">
        	<div class="menu">
				<ul>
				<li><a class="hide" href="IndexServlet">首页</a>
				<!--[if lte IE 6]>
				<a href="IndexServlet">首页
				<table><tr><td>
				<![endif]-->
					<ul>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=通知公告">学院概况</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=通知公告">学院概况
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="NewsViewServlet?ncname=学院简介" >学院简介</a></li>
					<li><a href="#" >学院领导</a></li>
					<li><a href="#" >组织机构</a></li>
					<li><a href="XYGKServlet?ncname=学院新闻" >学院新闻</a></li>
					<li><a href="XYGKServlet?ncname=通知公告" >通知公告</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="NewsViewServlet?ncname=师资队伍">师资队伍</a>
				<!--[if lte IE 6]>
				<a href="NewsViewServlet?ncname=师资队伍">师资队伍
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="NewsViewServlet?ncname=师资队伍" >师资队伍概况</a></li>
					<li><a href="SZDWServlet?major=1" >计算机系</a></li>
					<li><a href="SZDWServlet?major=2" >数学系</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=本科生教育">人才培养</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=本科生教育">人才培养
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=本科生教育" >本科生教育</a></li>
					<li><a href="XYGKServlet?ncname=研究生教育" >研究生教育</a></li>
					<li><a href="XYGKServlet?ncname=实验教学" >实验教学</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=科研项目">科学研究</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=科研项目">科学研究
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=科研项目">科研项目</a></li>
					<li><a href="XYGKServlet?ncname=学术论文">学术论文</a></li>
					<li><a href="XYGKServlet?ncname=基地建设">本地建设</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=组织架构">党建工作</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=组织架构">党建工作
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=组织架构">组织架构</a></li>
					<li><a href="XYGKServlet?ncname=党员风采">党员风采</a></li>
					<li><a href="XYGKServlet?ncname=党组织活动">党组织活动</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=学生会">学生工作</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=学生会">学生工作
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=学生会">学生会</a></li>
					<li><a href="XYGKServlet?ncname=学工动态">学工动态</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=本科生招生">招生就业</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=本科生招生">招生就业
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=本科生招生">本科生招生</a></li>
					<li><a href="XYGKServlet?ncname=研究生招生">研究生招生</a></li>
					<li><a href="XYGKServlet?ncname=就业信息">就业信息</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=教学">规章制度</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=教学">规章制度
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=教学">教学</a></li>
					<li><a href="XYGKServlet?ncname=科研">科研</a></li>
					<li><a href="XYGKServlet?ncname=财务">财务</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				<li><a class="hide" href="XYGKServlet?ncname=校友动态">校友汇</a>
				<!--[if lte IE 6]>
				<a href="XYGKServlet?ncname=校友动态">校友汇
				<table><tr><td>
				<![endif]-->
					<ul>
					<li><a href="XYGKServlet?ncname=校友动态">校友动态</a></li>
					<li><a href="XYGKServlet?ncname=校友风采">校友风采</a></li>
					<li><a href="XYGKServlet?ncname=校友留言">校友留言</a></li>
					</ul>
				<!--[if lte IE 6]>
				</td></tr></table>
				</a>
				<![endif]-->
				</li>
				</ul>
				</div>
        </div>
        <div class="dMid">
        	<div class="dLeft">
            	<div class="dlTop">
                	<div class="dltTop">
                    </div>
                    <div class="dlBotttom" >
                    	<div style=" padding-top:4px; font-size:12pt;font-family:'微软雅黑';">
                        	<a href="XYGKServlet?ncname=校友动态" style="text-decoration:none;color:#000000;">校友动态</a>
                        </div>
                        <div style=" padding-top:16px;font-size:12pt;font-family:'微软雅黑';">
                        	<a href="XYGKServlet?ncname=校友风采" style="text-decoration:none;color:#000000;">校友风采</a>
                        </div>
                        <div style=" padding-top:16px;font-size:12pt;font-family:'微软雅黑';">
                        	<a href="XYGKServlet?ncname=校友留言" style="text-decoration:none;color:#000000;">校友留言</a>
                        </div>
                    </div>
                </div>
                <div class="dlMid">
                	<div style="padding-top:30px;">
                        <a href="#"><img src="images/sjxx.jpg"></a>
                        <a href="#"><img src="images/bgxz.jpg"></a>
                        <a href="#"><img src="images/bszn.jpg"></a>
                        <a href="#"><img src="images/sjjy.jpg"></a>
                    </div>
                </div>
                <div class="dlBottom">
                	<select class="sel" onchange="javascript:jump(this)">
                    	<option>校内部门网站</option>
                    	<c:forEach items="${flst1}" var="flvo">
                    		<option value="${flvo.furl}">${flvo.fname}</option>
                    	</c:forEach>
                        
                    </select>
                    <select class="sel" onchange="javascript:jump(this)">
                    	<option>校内院系网站</option>
                        <c:forEach items="${flst2}" var="flvo">
                    		<option >${flvo.fname}</option>
                    	</c:forEach>
                    </select>
                    <select class="sel" onchange="javascript:jump(this)">
                    	<option>兄弟院系网站</option>
                        <c:forEach items="${flst3}" var="flvo">
                    		<option>${flvo.fname}</option>
                    	</c:forEach>
                    </select>
                </div>
            </div>
            <div style="float:left; width:5px; height:850px;"></div>
            <div class="dRight">
            	<div class="drTop">
                	<div ><img src="images/tip_02.jpg" style="margin-left:-400px;" align='absmiddle'>
                    	您现在的位置是：<a href="IndexServlet" style="text-decoration:none; font-size:12pt; color:#000000;">首页</a>》
                        <a href="" style="text-decoration:none;font-size:12pt; color:#000000;">校友会</a>》
                        <a href="" style="text-decoration:none;font-size:12pt; color:#000000;">${ncname}</a>
                    </div>
                    <div><img src="images/xyh.jpg"></div>
                </div>
                <div class="drMid">
                	<div style="width:775px; height:60px;">
                		<strong style="margin-right:600px; line-height:45px;">${ncname}</strong>
                        <hr>
                	</div>
                	<div>
                		<c:forEach items="${lst}" var ="nvvo">
                    		<div class="notice" >
                            	<a href="NewsViewServlet?nid=${nvvo.nid}&ncname=${nvvo.ncname}"><img src="images/tip_03.jpg">&nbsp;&nbsp;${nvvo.ntitle}</a>
                            </div>
                         </c:forEach>                      
                    </div>
                </div>
                <div class="drBottom">
                	<a href="XYGKServlet?pageIndex=1&ncname=${ncname}"><img src="images/first.jpg"></a>&nbsp;
                	<c:if test="${pageIndex>1}">
                    <a href="XYGKServlet?pageIndex=${pageIndex-1}&ncname=${ncname}"><img src="images/sy.jpg"></a>&nbsp;
                    </c:if>
                    <c:if test="${pageIndex<totalPage}">
                    <a href="XYGKServlet?pageIndex=${pageIndex+1}&ncname=${ncname}"><img src="images/xy.jpg"></a>&nbsp;
                    </c:if>
                    <a href="XYGKServlet?pageIndex=${totalPage}&ncname=${ncname}"><img src="images/wy.jpg"></a>&nbsp;
                </div>
            </div>
        </div>
        <div style="width:980px; height:20px;"></div>
        <div class="dBottom">
        	
        </div>
    </div>
</center>
</body>
</html>

