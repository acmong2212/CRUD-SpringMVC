<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Create Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form action="/create" method="post">
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>Nhap id</th>
            <th>Nhap name</th>
            <th>Nhap img</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="text" placeholder="Nhap id" name="id"></td>
            <td><input type="text" placeholder="Nhap name" name="name"></td>
            <td><input type="text" placeholder="Nhap img" name="img"></td>
        </tr>
        </tbody>
    </table>
    <button type="submit" >Create</button>
</div>
</form>
</body>
</html>

