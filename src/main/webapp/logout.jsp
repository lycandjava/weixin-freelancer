<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String allUrl =basePath+request.getParameter("url");
	//System.out.print("mjl"+request.getParameter("url"));
	//100 : 客户关系管理系统；101：通讯员主页；102：数据中心网站；103：收储信息查询；104：出库信息查询；105：承储库费用查询；
	String appid = request.getParameter("appid");
	
	if("100".equals(appid)){
		allUrl = basePath+"crm/index.action";
	}
	
	
%>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <script type="text/javascript" src="<%=basePath%>/dc/js/jquery-1.11.0.min.js"></script>
 <title></title> 
 </head> 
 <body>  
 </body>
<script type="text/javascript">
 $(function(){
	var callbackurl='?service=<%=allUrl%>';   
	 /* "http://172.16.40.2:7070/cncic-dc/login/reporterhomepage.action" */;
	var logoutUrl ="http://www.cncotton.com/cas/logout";
	window.location = logoutUrl+ callbackurl;
 });
</script>
</html>
