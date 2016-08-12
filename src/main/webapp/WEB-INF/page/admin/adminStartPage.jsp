<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08.08.2016
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
    <title>Title</title>
</head>
<body>
<%@ include file="menuAdmin.jsp" %>
<%@ include file="menuVertical.jsp" %>
<p> ${pageContext.request.contextPath} </p>

<p>${pageContext}</p>
<h1> Hello Nobody</h1>

</body>
</html>
