<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%
	String basePath = request.getContextPath() ;
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>
</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">用户管理</a></li>
			<li><a href="#">基本内容</a></li>
		</ul>
	</div>
	<div class="rightinfo">
		<div class="tools">
			<ul class="toolbar">
				<li class="click"><span><img src="<%=basePath %>/images/t01.png" /></span>添加</li>
				<li class="click"><span><img src="<%=basePath %>/images/t02.png" /></span>修改</li>
				<li><span><img src="<%=basePath %>/images/t03.png" /></span>删除</li>
				<li><span><img src="<%=basePath %>/images/t04.png" /></span>统计</li>
			</ul>
			<ul class="toolbar1">
				<li><span><img src="<%=basePath %>/images/t05.png" /></span>设置</li>
			</ul>

		</div>


		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" checked="checked" /></th>
					<th>编号<i class="sort"><img src="images/px.gif" /></i></th>
					<th>用户名</th>
					<th>密码</th>
					<th>姓名</th>
					<th>性别</th>
					<th>身份证</th>
					<th>出生日期</th>
					<th>学历</th>
					<th>电话</th>
					<th>Email</th>
					<th>QQ</th>
					<th>详细地址</th>
					<th>微信</th>
					<th>用户类型</th>
					<th>来源系统</th>
					<th>创建时间</th>
					<th>备注</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			
			<s:iterator value="userList" status="row">
				<tr>
					<td><input name="id" type="checkbox" value="id" /></td>
					<td><s:property value="#row.index+1"/></td>
					<td><s:property value="username"/> </td>
					<td><s:property value="password"/></td>
					<td><s:property value="fullname"/></td>
					<td><s:property value="sex"/></td>
					<td><s:property value="idCard"/></td>
					<td><s:property value="birthday"/></td>
					<td><s:property value="education"/></td>
					<td><s:property value="phone"/></td>
					<td><s:property value="email"/></td>
					<td><s:property value="qq"/></td>
					<td><s:property value="address"/></td>
					<td><s:property value="weixin"/></td>
					<td><s:property value="userType"/></td>
					<td><s:property value="sourceSystem"/></td>
					<td><s:property value="createDate"/></td>
					<td><s:property value="remark"/></td>
					<td>
						<a href="#" class="tablelink">查看</a>
						<a href="#"	class="tablelink">删除</a>
					</td>
				</tr>
			</s:iterator>
			</tbody>
		</table>

		<div class="pagin">
			<div class="message">
				共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><span
						class="pagepre"></span></a></li>
				<li class="paginItem"><a href="javascript:;">1</a></li>
				<li class="paginItem current"><a href="javascript:;">2</a></li>
				<li class="paginItem"><a href="javascript:;">3</a></li>
				<li class="paginItem"><a href="javascript:;">4</a></li>
				<li class="paginItem"><a href="javascript:;">5</a></li>
				<li class="paginItem more"><a href="javascript:;">...</a></li>
				<li class="paginItem"><a href="javascript:;">10</a></li>
				<li class="paginItem"><a href="javascript:;"><span
						class="pagenxt"></span></a></li>
			</ul>
		</div>
		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span><a></a>
			</div>
			<div class="tipinfo">
				<span><img src="images/ticon.png" /></span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>
			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" />&nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>
		</div>
	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
	
</body>
</html>