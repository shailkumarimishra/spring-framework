<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 2</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<form:form method="post" modelAttribute="userForm" action="wizard">
  <div class="mb-3">
    <form:label path="lastName" >Last name</form:label>
    <form:input path="lastName" class="form-control"/>
    <form:errors path="lastName" cssClass="error"/>
  </div>
   <div class="mb-3">
  <input type="hidden" value="1" name="_page">
  <input type="submit" value="Previous" name="_target0">
  <input type="submit" value="Next" name="_target2">
  <input type="submit" value="Cancel" name="_cancel">
  </div>
  </form:form>
</body>
</html>