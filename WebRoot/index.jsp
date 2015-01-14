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
    
    <title>武汉纺织大学数学与计算机学院</title>
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
		height:750px;
		}
			.dLeft{
				width:195px;
				height:750px;
				float:left;
				}
					.dlTop{
						width:195px;
						height:300px;
						background-image:url(images/2a.jpg);
						}
						
						.dltTop{
							width:195px;
							height:50px;
							}
						.dltBottom{
							width:195px;
							height:250px;
							}
						.dlTop .dltBottom .notice{
							width:195px;
							height:250px;
							
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
				width:780px;
				height:750px;
				float:left;
				}
				.drTop{
					width:780px;
					height:245px;
					}
				.drMid{
					width:780px;
					height:245px;
    				border: 1px solid #959afe;
					}
					.drmLeft{
						width:350px;
						height:245px;
						float:left;
						}
						.drmlTop{
						width:350px;
						height:40px;
						}
						.drmlBottom{
						width:350px;
						height:205px;
						}
					.drmRight{
						width:420px;
						height:245px;
						float:left;
						}
						.drmrTop{
						width:420px;
						height:40px;
						}
						.drmrBottom{
						width:420px;
						height:205px;
						background-image:url(images/yxxw.jpg);
						}
				.drBottom{
					width:780px;
					height:240px;
					}
				.drbTop{
					width:383px;
					height:240px;
					float:left;
    				border: 1px solid #959afe;
					}
					.drbtTop{
					width:383px;
					height:40px;
					}
						.drbttTop{
							width:303px;
							height:40px;
							float:left;
						}
						.drbttBottom{
							width:80px;
							height:40px;
							float:left;
						}
					.drbtBottom{
					width:383px;
					height:200px;
					}
				.drbBottom{
					width:383px;
					height:240px;
					float:left;
    				border: 1px solid #959afe;
					}
					.drbbTop{
					width:383px;
					height:40px;
					}
						.drbbtTop{
							width:303px;
							height:40px;
							float:left;
						}
						.drbbtBottom{
							width:80px;
							height:40px;
							float:left;
						}
					.drbbBottom{
					width:383px;
					height:200px;
					}
	.dBottom{
		width:980px;
		height:100px;
		background-image:url(images/4a.jpg);
		}
	.notice a{
		text-decoration:none;
		display:block;
		white-space:nowrap;
		overflow:hidden; 
		text-overflow:ellipsis;
		color:#000000;
		padding-top:8px;
		line-height:20px;
		text-align:left;
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
                    <div class="dlBotttom">
                    	<c:forEach items="${list4}" var="nvvo">
                    	<div style="font-size:8pt; width:195px; line-height:20px;">
                    		
                            <a href="NewsViewServlet?nid=${nvvo.nid}&ncname=${nvvo.ncname}" style="text-decoration:none; color:#000000;">
                                <img src="images/tip.jpg">&nbsp;&nbsp;${nvvo.ntitle}
                            </a>
                      
                        </div>
                        </c:forEach>
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
            	<div class="drTop" style="background-color:#246DC4;">
                	<div id="fsD1" class="focus" >  
                    <div id="D1pic1" class="fPic">  
                        <div class="fcon" style="display: none;">
                            <a target="_blank"><img src="images/01.jpg" style="opacity: 1; "></a>
                        </div>
                        
                        <div class="fcon" style="display: none;">
                            <a target="_blank"><img src="images/02.jpg" style="opacity: 1; "></a>
                        </div>
                        
                        <div class="fcon" style="display: none;">
                            <a target="_blank"><img src="images/03.jpg" style="opacity: 1; "></a>
                        </div>
                         
                    </div>
                    <div class="fbg">  
                    <div class="D1fBt" id="D1fBt">  
                        <a href="javascript:void(0)" hidefocus="true" target="_self" class=""><i>1</i></a>  
                        <a href="javascript:void(0)" hidefocus="true" target="_self" class=""><i>2</i></a>  
                        <a href="javascript:void(0)" hidefocus="true" target="_self" class="current"><i>3</i></a>  
                    </div>  
                    </div>  
                    <span class="prev"></span>   
                    <span class="next"></span>    
                </div>  
                <script type="text/javascript">
                    Qfast.add('widgets', { path: "js/terminator2.2.min.js", type: "js", requires: ['fx'] });  
                    Qfast(false, 'widgets', function () {
                        K.tabs({
                            id: 'fsD1',   //焦点图包裹id  
                            conId: "D1pic1",  //** 大图域包裹id  
                            tabId:"D1fBt",  
                            tabTn:"a",
                            conCn: '.fcon', //** 大图域配置class       
                            auto: 1,   //自动播放 1或0
                            effect: 'fade',   //效果配置
                            eType: 'click', //** 鼠标事件
                            pageBt:true,//是否有按钮切换页码
                            bns: ['.prev', '.next'],//** 前后按钮配置class                          
                            interval: 3000  //** 停顿时间  
                        }) 
                    })  
                </script>
                </div>
                <div style="width:780px; height:10px;"></div>
                <div class="drMid">
                	<div class="drmLeft">
                    	<div class="drmlTop">
                        	<div style="padding-top:10px; margin-left:-220px;  color:#4e727e; font-size:12pt;">学院新闻</div>
                        </div>
                        <div class="drmlBottom">
                        	<img src="images/news.jpg">
                        </div>
                    </div>
                    <div class="drmRight">
                    	<div class="drmrTop">
                        	<div style="padding-top:10px; margin-left:330px;">
                            	<a href="XYGKServlet?ncname=学院新闻" style="text-decoration:none; color:black; font-size:12pt; align:center;">更多>></a>
                            </div>
                        </div>
                        <div class="drmrBottom">
	                          <c:forEach items="${list1}" var="nvvo">
	                            <div class="notice">
	                            	<a href="NewsViewServlet?nid=${nvvo.nid}&ncname=${nvvo.ncname}">&nbsp;&nbsp;<img src="images/tip.jpg">&nbsp;&nbsp;${nvvo.ntitle}</a>
	                            </div>
	                          </c:forEach>
                        </div>
                    </div>
                </div>
                
                <div style="width:780px; height:10px;"></div>
                
                <div class="drBottom">
                	<div class="drbTop">
                    	<div class="drbtTop">
                        	<div class="drbttTop">
                           		 <div style="padding-top:10px; margin-left:-180px;  color:#4e727e; font-size:12pt;">学术动态</div>
                            </div>
                            <div class="drbttBottom">
                           		<div style="padding-top:10px; margin-left:10px;">
                                	<a href="XYGKServlet?ncname=学术动态" style="text-decoration:none; color:black; font-size:12pt; align:center;">更多>></a>
                                </div> 
                            </div>
                        </div>
                        <div class="drbtBottom" >
                        	<c:forEach items="${list2}" var="nvvo">
	                            <div class="notice">
	                            	<a href="NewsViewServlet?nid=${nvvo.nid}&ncname=${nvvo.ncname}">&nbsp;&nbsp;<img src="images/tip.jpg">&nbsp;&nbsp;${nvvo.ntitle}</a>
	                            </div>
	                        </c:forEach>
                        </div>
                    </div>
                    <div style="width:10px; height:240px; float:left"></div>
                    <div class="drbBottom">
                    	<div class="drbbTop">
                        	<div class="drbbtTop">
                           		 <div style="padding-top:10px; margin-right:200px;color:#4e727e; font-size:12pt;">学工动态</div>
                            </div>
                            <div class="drbbtBottom">
                           		<div style="padding-top:10px; margin-left:10px; ">
                                	<a href="XYGKServlet?ncname=学工动态" style="text-decoration:none; color:black; font-size:12pt; align:center;">更多>></a>
                                </div> 
                            </div>
                        </div>
                        <div class="drbbBottom">
                        	<c:forEach items="${list3}" var="nvvo">
	                            <div class="notice">
	                            	<a href="NewsViewServlet?nid=${nvvo.nid}&ncname=${nvvo.ncname}">&nbsp;&nbsp;<img src="images/tip.jpg">&nbsp;&nbsp;${nvvo.ntitle}</a>
	                            </div>
	                        </c:forEach>
                        </div>
                    </div>
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
