<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../part/cache-control-header.jsp" %>
[
<s:iterator id="stat" value="stats" status="row">
<s:property value="#stat.toJson()" escape="false"/>
<s:if test="!#row.last">,</s:if></s:iterator>
]