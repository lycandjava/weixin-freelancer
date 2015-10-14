<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
[<s:iterator value="items" status="row">'<s:property escape="false"/>'<s:if test="!#row.last">,</s:if></s:iterator>]
