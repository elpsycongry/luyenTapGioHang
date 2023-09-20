<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>List cart</title>
</head>
<body>
<table style="width: 70%; margin: auto; text-align: center">
    <tr>
        <th>
            Name
        </th>
        <th>
            Type
        </th>
        <th>
            Date
        </th>
    </tr>
    <c:forEach var="product" items="${listCart}">
        <tr>
            <td>
                    ${product.name}
            </td>
            <td>
                    ${product.type}
            </td>
            <td>
                    ${product.date}
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
