<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<form:form method="post" modelAttribute="user" action="login">
  <div class="mb-3">
    <form:label path="emailId" >Email address</form:label>
    <form:input path="emailId" type="text" class="form-control" id="exampleInputEmail1"/>
    <form:errors path="emailId" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="password" >Password</form:label>
    <form:input path="password" type="password" class="form-control" id="exampleInputPassword1"/>
    <form:errors path="password" cssClass="error"/>
  </div>
  
  <button type="submit" class="btn btn-primary">Login</button>
</form:form>

</body>
</html>