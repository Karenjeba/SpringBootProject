<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Courses</title>
<link rel="stylesheet" type="text/css" href="/CSS/showcourse.css">
</head>
<jsp:include page="home.jsp" flush="true"></jsp:include>

<body>
<div class = "form" >
        <table border="1" id="courses">
            <caption>List of Courses</caption>
            <thead>
             <tr>
                <th>Course Name</th>
                <th>Course Description</th>
                
             </tr>
             </thead>
             <tbody>
            <c:forEach var = "course" items = '${courselist}'>
            <tr>
                    <td><c:out value='${course.courseName}'/></td>
                    <td><c:out value='${course.courseDesc}'/></td>                  
                         
             </tr>
            </c:forEach>
            </tbody>
                       
        </table>
      </div>
</body>
</html>