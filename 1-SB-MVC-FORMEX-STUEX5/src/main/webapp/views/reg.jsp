<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<h1>STUDENT MARKS DETAILS</h1>
<form:form modelAttribute="user" action="/register">
<table>
<tr>
<td>STUDENT ID</td>
<td><form:input path="sid"/></td>
</tr>
<tr>
<td> FIRST NAME</td>
<td><form:input path="fname"/></td>
</tr>
<tr>
<td>LAST NAME</td>
<td><form:input path="lname"/></td>
</tr>
<tr>
<td>Please select your courses:</td>
                <td><form:select path="courses">
                      <form:option value="" label="Please Select" />
                      <form:options items="${courses}" />
                       </form:select>
</tr>
<tr> 
<td>gender</td>
<td><form:radiobuttons path="gender" items="${genders}" /></td>
</tr>
<tr> 
<td>mobile number</td>
<td><form:input  path="mnum"  /></td>
</tr>
<tr> 
<td>java marks</td>
<td><form:input  path="jmarks"  /></td>
</tr>
<tr>
<td>hybernate marks</td>
<td><form:input  path="hmarks"  /></td>
</tr>
<tr>
<td>Springboot marks</td>
<td><form:input  path="smarks"  /></td>
</tr>
<tr>
<td><input type="submit" value="printresult"/></td>
</tr>
</table>
</form:form>

</body>

</html>
