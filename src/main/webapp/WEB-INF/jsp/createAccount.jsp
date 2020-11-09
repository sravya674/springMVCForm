<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Demo App</title>
</head>
<body>
    <h1>Enter Account details:</h1>
    <form:form commandName="aNewAccount">
         
         <table>
            <tr><td>First Name:  <form:input type="text" path="firstName" name="firstname" /></td></tr>
            <tr><td>Last Name:  <form:input type="text" path="lastName" name="lastname" /></td></tr>
            <tr><td>Address:  <form:input type="text" path="address" name="address" /></td></tr>
            <tr><td>Email:  <form:input type="text" path="email" name="email" /></td></tr>
            <tr><td><input type="submit" name="Create   " /></td></tr>       
         </table>    
    </form:form>
</body>
</html>