<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Calculator</title>
</head>
<body>
<h1>Calculate!
    <form method = "POST"
          action="hello-servlet">
        <label for="num1">Number 1:</label><br>
        <input type="text" id="num1" name="num1"><br><br>
        <label for="num2">Number 2:</label><br>
        <input type="text" id="num2" name="num2"><br>
        <br><br>
        <input type="Submit" value="Submit">
    </form>
</h1>
<br/>
</body>
</html>