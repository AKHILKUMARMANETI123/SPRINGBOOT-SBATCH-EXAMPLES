<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
STUDENT IS:${users.sid}<br>
STUDENT FIRSET NAME:${users.fname}<br>
Student lastname:${users.lname}<br>
Student gende:${users.gender}<br>
COURSES:
<c:forEach var="course" items="${user.courses}">  
            <c:out value="${course}"/><br>
    </c:forEach><br>
  TOTAL MARKS:${total} 
percentage:${per}<br>

grade:${grade}<br>



