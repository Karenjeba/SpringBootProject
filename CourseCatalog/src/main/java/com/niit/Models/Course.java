package com.niit.Models;


public class Course 
{
	
private String courseId;
private String courseName;
private String courseDesc;
public String getCourseDesc() {
	return courseDesc;
}
public void setCourseDesc(String courseDesc) {
	this.courseDesc = courseDesc;
}
public Course()
{
	
}
public Course(String courseId, String courseName) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
}

}
