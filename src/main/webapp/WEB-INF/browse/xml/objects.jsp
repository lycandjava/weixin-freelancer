<%@ page contentType="text/xml; charset=GBK" %><%@ taglib prefix="s" uri="/struts-tags" %><?xml version="1.0" encoding="GBK" ?>
<result>
<s:iterator id="object" value="objects" status="row">
<s:property value="#object.toXml()" escape="false"/>
</s:iterator>
</result>
