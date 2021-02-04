<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit SmartPhone</title>
</head>
<body>
<h1>Edit SmartPhone</h1>
<p>
    <a href="/products">List</a>
</p>
<form method="post">
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${product.getName()}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="number" name="price" value="${product.getPrice()}"></td>
        </tr>
        <tr>
            <td>description</td>
            <td><input type="text" name="description" value="${product.getDescription()}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
