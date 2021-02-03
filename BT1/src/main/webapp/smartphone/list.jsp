<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List SmartPhone</title>
</head>
<body>
<h1>List SmartPhone</h1>
<a href="/smartphone?action=create">Create SmartPhone</a>
<table>
    <tr>
        <td>Serial</td>
        <td>Brand</td>
        <td>Name</td>
        <td>Price</td>
        <td>Year Product</td>
        <td>Size Screen</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${listSmartPhone}" var="lis">
        <tr>
            <td>${lis.getId()}</td>
            <td>${lis.getBrand()}</td>
            <td>${lis.getName()}</td>
            <td>${lis.getPrice()}</td>
            <td>${lis.getYearProduct()}</td>
            <td>${lis.getSizeScreen()}</td>
            <td><a href="/smartphone?action=update&id=${lis.getId()}">Edit</a></td>
            <td><a href="/smartphone?action=delete&id=${lis.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
