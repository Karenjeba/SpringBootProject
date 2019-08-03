<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Courses</title>
<link rel="stylesheet" type="text/css" href="/CSS/addcourse.css">
</head>
<body>
<jsp:include page="home.jsp" flush="true"></jsp:include>
<div class="container">
<form action="addCourse" >
<div class="box">
<label for="courseId"><b>Enter Course Id</b></label>
<input type="text" name="courseId"/>
<label for="courseName"><b>Enter Course Name</b></label>
<input type="text" name="courseName"/>
<label for="courseDesc"><b>Enter Course Description</b></label>
<input type="text" name="courseDesc"/>
<input type="submit" value="Add"/>
</div>
</form>
</div>
</body>
</html>