<%--
  Created by IntelliJ IDEA.
  User: linghao
  Date: 2021/6/25
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
  <tr>
    <td>id</td>
    <td>name</td>
  </tr>
  <c:forEach items="${cs}" var="c" varStatus="st">
    <tr>
      <td>${c.id}</td>
      <td>${c.name}</td>

    </tr>
  </c:forEach>
</table>

</body>
</html>
