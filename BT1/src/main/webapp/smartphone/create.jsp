<%--
  Created by IntelliJ IDEA.
  User: duytran
  Date: 2/3/21
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create SmartPhone</title>
</head>
<body>
<h1>Create SmartPhone</h1>
<a href="/smartphone">Lis SmartPhone</a>
<form method="post">
    <table>
        <tr>
            <td>Brand</td>
            <td><input type="text" name="brand"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="number" name="price"></td>
        </tr>
        <tr>
            <td>Year Product</td>
            <td><input type="text" name="yearproduct"></td>
        </tr>
        <tr>
            <td>Size Screen</td>
            <td><input type="text" name="sezicreen"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
