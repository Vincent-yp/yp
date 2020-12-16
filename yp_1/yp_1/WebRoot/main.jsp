<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
String uname = (String)session.getAttribute("chiName");
if(uname==null||uname==""){
	response.sendRedirect("servlet/MainController?err=urlerror");
}
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
   
   <title>main</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
<link rel="stylesheet" type="text/css" href="styles.css">
-->
<style type="text/css">
			body{
				margin: 0;
				padding: 0;
			}
			header{
				margin: 0 auto;
				width: 1000px;
			}
			#picd{
				margin: 0 auto;
				width: 1000px;
				text-align: center;
			}
			#picd img{
				width: 950px;
			}
			header #tip{
				text-align: right;
				color: darkgrey;
			}
			a{
				text-decoration: none;
				color: #848484;
				
			}
			#dav ul{
				position: absolute;
				margin-top: -50px;
				/* text-align: right; */
				/* right: 0; */
				list-style: none;
				line-height: 30px;
				margin-left: 430px;
				list-style: none;
				font-family: "微软雅黑";
			}
			#dav ul li{
				/* position: absolute; */
				/* text-align: right; */
				/* display: block; */
				float: left;
				margin-left: 30px;
				border-left: 1px solid #A9A9A9;
				/* text-align: center; */
			}
			#dav ul li:first-child{
				border-left: 0px;
			}
			#dav ul li a{
				padding-left: 20px;
				color: black;
			}
		</style>
  </head>
  <body>
		<header>
			<p id="tip">欢迎您：${chiName }&nbsp;【<a href="servlet/MainController?err=loginout">安全退出</a>】</p>
			<div id="dav">
				<img src="img/p.png"/>
				<ul>
					<li><a href="">首页</a></li>
					<li><a href="servlet/DownLoadController?download=select">下载</a></li>
					<li><a href="">设计</a></li>
					<li><a href="">相册</a></li>
					<li><a href="">论坛</a></li>
					<li><a href="">关于</a></li>
				</ul>
				<hr size="10" color="#000000" />
			</div>
		</header>
		<div id="picd">
			<img src="img/fj.png">
		</div>
	</body>
</html>
