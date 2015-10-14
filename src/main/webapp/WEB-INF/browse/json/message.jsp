<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:if test="message"><s:property value="message.toJson()" escape="false"/></s:if>
<s:else>{}</s:else>
