<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List SmartPhone</title>
</head>
<body>
<h1>List Product</h1>
<a href="/products?action=create">Create SmartPhone</a>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${products}" var="lis">
        <tr>
            <td>${lis.getName()}</td>
            <td>${lis.getPrice()}</td>
            <td>${lis.getDescription()}</td>
            <td><a href="/products?action=edit&id=${lis.getId()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${lis.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
