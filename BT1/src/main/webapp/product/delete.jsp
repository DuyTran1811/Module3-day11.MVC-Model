<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete SmartPhone</h1>
<%--<a href="/products"></a>--%>
<form method="post">
    <table border="1">
        <tr>
            <td>Name</td>
            <td>${list.getName()}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${list.getPrice()}</td>
        </tr>
        <tr>
            <td>Year Product</td>
            <td>${list.getDescription()}</td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Delete SmartPhone"></td>
        </tr>
    </table>
</form>
</body>
</html>
