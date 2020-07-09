<%--
  Created by IntelliJ IDEA.
  User: YLxia
  Date: 2020/7/8
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
<c:forEach items="${pageInfo.list }" var="emp">
    ${emp}
</c:forEach>
</body>
</html>
