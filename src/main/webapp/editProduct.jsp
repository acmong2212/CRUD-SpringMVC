<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form method="post">
    <div class="container">
        <table class="table">
            <tbody>
            <tr>
                <td><input type="text" placeholder="Nhap name" name="name" value="${product.name}"></td>
                <td><input type="text" placeholder="Nhap img" name="img" value="${product.img}"></td>
            </tr>
            </tbody>
        </table>
        <button type="submit" >Submit</button>
    </div>
</form>
</body>
</html>
