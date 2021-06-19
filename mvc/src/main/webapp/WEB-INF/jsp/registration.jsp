<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<form:form method="post" modelAttribute="registration" action="registration">
  <div class="mb-3">
    <form:label path="firstName" >First name</form:label>
    <form:input path="firstName" class="form-control"/>
    <form:errors path="firstName" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="lastName" >Last name</form:label>
    <form:input path="lastName" class="form-control"/>
    <form:errors path="lastName" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="phoneNo" >Phone Number</form:label>
    <form:input path="phoneNo" class="form-control"/>
    <form:errors path="phoneNo" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="email" >Email</form:label>
    <form:input path="email" class="form-control"/>
    <form:errors path="email" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="gender" >Gender</form:label>
    <form:radiobuttons path="gender" items="${genders}"/>
    <form:errors path="gender" cssClass="error"/>
  </div>
  
  <div class="mb-3">
    <form:label path="address" >Address</form:label>
    <form:input path="address" type="text" class="form-control"/>
    <form:errors path="address" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="courses" >Courses</form:label>
    <form:checkboxes items="${courseList}" path="courses"/>
    <form:errors path="courses" cssClass="error"/>
  </div>
  <div class="mb-3">
    <form:label path="timing" >Timing</form:label>
    <form:select path="timing" items="${timings}"/>
    <form:errors path="timing" cssClass="error"/>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>

</body>
</html>