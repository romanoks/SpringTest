<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.08.2016
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
    <title>Title</title>
</head>
<body>
<%@ include file="mainmenu.jsp"%>
<h3>Hello World!!!</h3>
<p>${message}</p>

</body>
</html>
