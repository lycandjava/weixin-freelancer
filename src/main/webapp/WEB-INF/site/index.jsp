<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
	ul li.item  {clear:both;}
	.items li {float:left;}
</style>

</head>
<body>
<h1>欢迎你！！！xxx</h1>

<table>
<s:iterator value="userList" status="row">
<tr class="item">
	<td><s:property value="#row.index+1" /> </td>
	<td><s:property value="id" /> </td>
	<td><s:property value="username" /> </td>
	<td><s:property value="password" /> </td>
 </tr>
</s:iterator>
</table>
</body>
</html>