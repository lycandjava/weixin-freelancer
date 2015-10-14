<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../part/cache-control-header.jsp" %>
{"ResultSet":{
"Result":
[<s:iterator id="object" value="objects" status="row">
<s:property value="#object.toJson()" escape="false"/>
<s:if test="!#row.last">,</s:if>
</s:iterator>]
}}
