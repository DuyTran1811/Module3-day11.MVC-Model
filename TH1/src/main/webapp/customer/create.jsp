
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creat new Customer</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Create new Customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message"${sessionScope["message"]}></span>
    </c:if>
</p>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<div>
    <form method="post">
        <fieldset>
            <legend>Customer information</legend>
            <table>
                <tr>
                    <td>Name:</td>
                    <td>
                        <input type="text" name="name" id="name">
                    </td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td>
                        <input type="text" name="email" id="email">
                    </td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td>
                        <input type="text" name="address" id="address">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Create customer">
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
</div>
</body>
</html>
