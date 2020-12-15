<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/30
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
头痛痛通天塔
<f:form modelAttribute="book" action="${pageContext.request.contextPath}/book/hello" method="post">
书名：<f:input path="bookName"></f:input><br>
    价格：<f:input path="bookPrice"></f:input><br>
    备注:<f:input path="bookBrief"></f:input><br>
    <input type="submit" value="确定">
</f:form>
<%=System.currentTimeMillis()%>
<div>
<a href="${pageContext.request.contextPath}/book/zh">zh</a>
    <a href="${pageContext.request.contextPath}/book/en">en</a>

</div>
<div>

    <p>
        <t:message code="yhzh.label"></t:message>
    </p>
    <p>
        <t:message code="yhmm.label"></t:message>
    </p>
    <p>
        ${msg}
    </p>
</div>

</body>
</html>
