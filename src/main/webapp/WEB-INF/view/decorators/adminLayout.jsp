<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String basePath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><sitemesh:write property='title' /></title>
<sitemesh:write property='head' />
<link href="<%=basePath%>/css/style.css" rel="stylesheet"
	type="text/css" />
<script language="JavaScript" src="<%=basePath%>/js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		//顶部导航切换
		$(".nav li a").click(function() {
			$(".nav li a.selected").removeClass("selected")
			$(this).addClass("selected");
		});
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	})
</script>
<style type="text/css">
.mianTop {
	width: 100%;
	height: 88px;
	background: url(<%=basePath%>/images/topbg.gif) repeat-x;
}

.mainCenter {
	width: 100%;
	display: block;
}

.mainLeft {
	width: 186px;
	float: left;
}

.mainRight {
	float: left;
	font-family: '微软雅黑';
	margin: 0 auto;
	min-width: 980px;
}
</style>
</head>
<body>
	<div class="mainframe">
		<div class="mianTop">
			<div class="topleft">
				<a href="<%=basePath%>" target="_parent"><img
					src="<%=basePath%>/images/logo.png" title="系统首页" /></a>
			</div>
			<ul class="nav">
				<li><a href="default.html" target="rightFrame" class="selected"><img
						src="<%=basePath%>/images/icon01.png" title="工作台" />
						<h2>工作台</h2></a></li>
				<li><a href="imgtable.html" target="rightFrame"><img
						src="<%=basePath%>/images/icon02.png" title="模型管理" />
						<h2>模型管理</h2></a></li>
				<li><a href="imglist.html" target="rightFrame"><img
						src="<%=basePath%>/images/icon03.png" title="模块设计" />
						<h2>模块设计</h2></a></li>
				<li><a href="tools.html" target="rightFrame"><img
						src="<%=basePath%>/images/icon04.png" title="常用工具" />
						<h2>常用工具</h2></a></li>
				<li><a href="computer.html" target="rightFrame"><img
						src="<%=basePath%>/images/icon05.png" title="文件管理" />
						<h2>文件管理</h2></a></li>
				<li><a href="tab.html" target="rightFrame"><img
						src="<%=basePath%>/images/icon06.png" title="系统设置" />
						<h2>系统设置</h2></a></li>
			</ul>

			<div class="topright">
				<ul>
					<li><span><img src="images/help.png" title="帮助"
							class="helpimg" /></span><a href="#">帮助</a></li>
					<li><a href="#">关于</a></li>
					<li><a href="login.html" target="_parent">退出</a></li>
				</ul>

				<div class="user">
					<span>admin</span> <i>消息</i> <b>5</b>
				</div>

			</div>
		</div>
		<div class="mainCenter">
			<div class="mainLeft">
				
			</div>
			<div class="mainRight">

				<sitemesh:write property='body' />
			</div>
		</div>

	</div>



</body>
</html>