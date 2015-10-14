<%@ page contentType="text/html; charset=GBK" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@include file="../part/cache-control-header.jsp" %>
{"key":
[<s:iterator id="key" value="helper.keys" status="row">"<s:date name="#key" format="%{helper.uiFormatter}"/>"<s:if test="!#row.last">,</s:if></s:iterator>],
"data":
[
<s:iterator id="data" value="helper.datas" status="row">
[
<s:iterator value="#data" status="st">
<s:property/>
<s:if test="!#st.last">,</s:if>
</s:iterator>
]
<s:if test="!#row.last">,</s:if>
</s:iterator>
]
}
