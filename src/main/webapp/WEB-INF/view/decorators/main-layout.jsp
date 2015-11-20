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
html, body {
	overflow: hidden;
	height: 100%;
	margin: 0;
	padding: 0;
	font: 14px/1.8 Georgia, Arial, Simsun;
	font-family: '微软雅黑';
}

html {
	_padding: 10px 0;
}

#hd {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 88px;
	background: url(<%=basePath%>/images/topbg.gif) repeat-x;
}

#bd {
	position: absolute;
	top: 88px;
	right: 0;
	bottom: 28px;
	left: 0;
	overflow: hidden;
	width: 100%;
	_height: 100%;
}

#side {
	position: absolute;
	top: 0;
	left: 0;
	bottom: 0;
	overflow: hidden;
	width: 186px;
	background-color:rgb(240, 249, 253);
	_height: 100%;
}

#main {
	position: absolute;
	_position: static;
	top: 0;
	right: 0;
	bottom: 0;
	left: 186px;
	overflow: auto;
	_overflow: hidden;
	_height: 100%;
	_margin-left: 186px;
}

#content {
	_overflow: auto;
	_width: 100%;
	_height: 100%;
}

#ft {
	position: absolute;
	bottom: 0;
	left: 0;
	width: 100%;
	height: 28px;
}
/* 与布局无关，一些说明性内容样式 */
.copyright {
	border: 1px solid #929292; font-weight : bold;
	text-align: center;
	font-weight: bold;
}
</style>
</head>
<body>
	<div id="hd">
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
				<li><span><img src="<%=basePath%>/images/help.png" title="帮助"
						class="helpimg" /></span><a href="#">帮助</a></li>
				<li><a href="#">关于</a></li>
				<li><a href="login.html" target="_parent">退出</a></li>
			</ul>

			<div class="user">
				<span>admin</span> <i>消息</i> <b>5</b>
			</div>

		</div>
	</div>
	<div id="bd">
		<div id="side">
			<div class="lefttop">
				<span></span>通讯录
			</div>

			<dl class="leftmenu">
				<dd>
					<div class="title">
						<span><img src="<%=basePath%>/images/leftico01.png" /></span>管理信息
					</div>
					<ul class="menuson">
						<li class="active"><cite></cite><a href="User.action" target="rightFrame">用户管理</a><i></i></li>
						<li><cite></cite><a
							href="<%=basePath%>/site/index.jsp">数据列表</a><i></i></li>
						<li><cite></cite><a href="imgtable.html" target="rightFrame">图片数据表</a><i></i></li>
						<li><cite></cite><a href="form.html" target="rightFrame">添加编辑</a><i></i></li>
						<li><cite></cite><a href="imglist.html" target="rightFrame">图片列表</a><i></i></li>
						<li><cite></cite><a href="imglist1.html" target="rightFrame">自定义</a><i></i></li>
						<li><cite></cite><a href="tools.html" target="rightFrame">常用工具</a><i></i></li>
						<li><cite></cite><a href="filelist.html" target="rightFrame">信息管理</a><i></i></li>
						<li><cite></cite><a href="tab.html" target="rightFrame">Tab页</a><i></i></li>
						<li><cite></cite><a href="error.html" target="rightFrame">404页面</a><i></i></li>
					</ul>
				</dd>
				<dd>
					<div class="title">
						<span><img src="<%=basePath%>/images/leftico02.png" /></span>其他设置
					</div>
					<ul class="menuson">
						<li><cite></cite><a href="#">编辑内容</a><i></i></li>
						<li><cite></cite><a href="#">发布信息</a><i></i></li>
						<li><cite></cite><a href="#">档案列表显示</a><i></i></li>
					</ul>
				</dd>
				<dd>
					<div class="title">
						<span><img src="<%=basePath%>/images/leftico03.png" /></span>编辑器
					</div>
					<ul class="menuson">
						<li><cite></cite><a href="#">自定义</a><i></i></li>
						<li><cite></cite><a href="#">常用资料</a><i></i></li>
						<li><cite></cite><a href="#">信息列表</a><i></i></li>
						<li><cite></cite><a href="#">其他</a><i></i></li>
					</ul>
				</dd>
				<dd>
					<div class="title">
						<span><img src="<%=basePath%>/images/leftico04.png" /></span>日期管理
					</div>
					<ul class="menuson">
						<li><cite></cite><a href="#">自定义</a><i></i></li>
						<li><cite></cite><a href="#">常用资料</a><i></i></li>
						<li><cite></cite><a href="#">信息列表</a><i></i></li>
						<li><cite></cite><a href="#">其他</a><i></i></li>
					</ul>
				</dd>
			</dl>
		</div>
		<div id="main">
			<div id="content">
				<sitemesh:write property='body' />
			</div>
		</div>
	</div>
	<div id="ft">
		<address class="copyright">
			Copyright &copy; <a href="http://www.yidab.com/">明医众禾科技 2015-2020</a>
		</address>
	</div>
</body>
</html>