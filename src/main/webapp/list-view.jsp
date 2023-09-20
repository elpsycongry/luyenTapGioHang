<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<table style="width: 70%; margin: auto; text-align: center">
    <tr>
        <th>
            Name
        </th><th>
        Type
    </th><th>
        Date
    </th>
        <th></th>
    </tr>
    <c:forEach var="product" items="${sessionScope['Data']}">
        <form action="addProduct" method="post" accept-charset="UTF-8">
            <input type="hidden" name="name" value="${product.name}">
            <input type="hidden" name="type" value="${product.type}">
            <input type="hidden" name="date" value="${product.date}">
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
                <td><input type="submit" value="Add to cart" style="color: white; background-color: dodgerblue; border: none"></td>
            </tr>
        </form>
    </c:forEach>
    <tr>
        <td>
            <a href="list-cart-view.jsp"> View My Cart</a>
        </td>
    </tr>
</table>
</body>
</html>
