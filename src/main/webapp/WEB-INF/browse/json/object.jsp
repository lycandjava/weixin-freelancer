<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:if test="object"><s:property value="object.toJson()" escape="false"/></s:if>
<s:else>{}</s:else>
