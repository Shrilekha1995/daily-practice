<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#id3{
 text-align: center;
}
</style>
</head>
<body>


             
          <form:form  modelAttribute="task">
        
        <table>
            <tr>
                <td><label for="id">Id: </label> </td>
                <td><form:input type="number" path="id" id="id"/></td>
            </tr>
             <tr>
             <td>
                            <input type="submit" value="Submit"/>
                    
                </td>
            </tr>
        </table>
    </form:form>  
         
       <div id=id3>
       <h1>List of tasks</h1>
       </div>
       
	<table border="1" style="border:1px solid black;margin-left:auto;margin-right:auto;">
		<tr style="background-color: #f18973">
		<td>Id</td><td>Name</td><td>Task</td><td>Assigned By</td><td>Status</td><td>Operation</td>
		</tr>
		<c:forEach items="${tasks}" var="tasks">
		<tr>
		<td>${tasks.id}</td>
		<td>${tasks.name}</td>
		<td>${tasks.task}</td>
		<td>${tasks.assignedBy}</td>
		<td>${tasks.status}</td>
		<td><a href="<c:url value='/edit${tasks.id}' />">edit</a>|<a href="<c:url value='/delete${tasks.id}' />">delete</a></td>
		</tr>
		</c:forEach>
	</table>
	</body>
</html>