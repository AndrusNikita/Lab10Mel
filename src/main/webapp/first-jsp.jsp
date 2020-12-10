<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Lab 10 Marina</title>
</head>
<body>
<h2> Enter parameters of equation</h2>
<form method="post" action="/my-app/cool-servlet">
    <h3> &nbsp;Enter start day: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Enter start month: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Enter start year: </h3>
    <input type="text" name="StartDay"> <input type="text" name="StartMonth"> <input type="text" name="StartYear">
    <h3> &nbsp;Enter end day: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Enter end month: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Enter end year: </h3>
    <input type="text" name="EndDay"> <input type="text" name="EndMonth"> <input type="text" name="EndYear">
    <br/>
    <br/>
    &nbsp;&nbsp;<button type="submit">Сalculate</button>
</form>

</body>
</html>