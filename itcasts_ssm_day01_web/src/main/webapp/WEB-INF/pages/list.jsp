<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/2/22
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>这是List界面</h3>

<c:forEach items="${list}" var="product">
    ${product.cityName}<br>
</c:forEach>

</body>
</html>
