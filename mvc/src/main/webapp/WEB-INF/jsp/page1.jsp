<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 1</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<form:form method="post" modelAttribute="userForm" action="wizard">
  <div class="mb-3">
    <form:label path="firstName" >First Name</form:label>
    <form:input path="firstName" class="form-control"/>
    <form:errors path="firstName" cssClass="error"/>
  </div>
  <div class="mb-3">
  <input type="hidden" value="0" name="_page">
  <input type="submit" value="Next" name="_target1">
  <input type="submit" value="Cancel" name="_cancel">
  </div>
  </form:form>
</body>
</html>