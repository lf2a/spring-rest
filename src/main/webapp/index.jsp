<%--
  Created by IntelliJ IDEA.
  User: luiz
  Date: 02/09/2020
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring REST</title>
</head>
<body>
<h1>Spring REST Demo</h1>
<ul>
    <li>
        <a href="${pageContext.request.contextPath}/test/hello">Hello</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/api/students">List Students</a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/api/students/0">Get Students (id=0)</a>
    </li>
</ul>
</body>
</html>
