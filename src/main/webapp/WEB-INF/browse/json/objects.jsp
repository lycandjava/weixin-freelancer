<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../part/cache-control-header.jsp" %>
[<s:iterator id="object" value="objects" status="row">
<s:property value="#object.toJson()" escape="false"/>
<s:if test="!#row.last">,</s:if>
</s:iterator>]

