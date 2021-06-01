<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Servlet - Calculator</title>
</head>
<body>
<h1>Do Your Calculate!
    <br><br>
    <form method = "POST"
          action="hello-servlet">
        <label for="num1">Integer 1:</label><br>
        <input type="text" id="num1" name="num1"><br>
        <label for="num2">Integer 2:</label><br>
        <input type="text" id="num2" name="num2"><br>
        <p>Please choose your calculation</p>
        <input type="radio" id="Add" name="sign" value="Add" checked>
        <label for="Add">Add</label><br>
        <input type="radio" id="Subtract" name="sign" value="Subtract">
        <label for="Subtract">Subtract</label><br>
        <input type="radio" id="Multiply" name="sign" value="Multiply">
        <label for="Multiply">Multiply</label><br>
        <input type="radio" id="Divide" name="sign" value="Divide">
        <label for="Divide">Divide</label><br>
        <input type="Submit" value="Submit">
    </form>
</h1>
<br/>
</body>
</html>