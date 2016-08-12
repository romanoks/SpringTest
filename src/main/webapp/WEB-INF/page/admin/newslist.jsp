<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.08.2016
  Time: 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
    <title>Admin</title>
</head>
<body>
    <%@ include file="menuAdmin.jsp" %>
    <%@ include file="menuVertical.jsp" %>
    <c:forEach items = "${news}" var = "current">
        <p><c:out value="${current}"/></p>
    </c:forEach>

    <form name="newArticle" method="POST">
        <input type="text" name="article" title="Article" value="${fields.get("article")}"> Article<br>
        <input type="date" name="date" title="Date" value="${fields.get("date")}"> Date<br>
        <input type="color" name="color" title="Color" value="${fields.get("color")}"> Color<br>
        <input type="file" name="file" title="File" value="${fields.get("file")}"> File<br>
        <input type="email" name="email" title="Email" value="${fields.get("email")}"> Email<br>
        <input type="image" name="image" title="Image" src="${pageContext.request.contextPath}/resources/img/jj.jpg"> Image<br>
        <input type="range" name="range" title="Range" value="${fields.get("range")}"> Range<br>
        <input type="submit" title="Send">
    </form>

    <a href="/admin/news">Go to Admin's page</a>
</body>
</html>

