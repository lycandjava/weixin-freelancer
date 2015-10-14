<%@ page contentType="text/xml; charset=UTF-8" %><%@ taglib prefix="s" uri="/struts-tags" %><?xml version="1.0" encoding="UTF-8" ?>
<s:if test="object"><s:property value="object.toXml()" escape="false"/></s:if>
<s:else><result/></s:else>
