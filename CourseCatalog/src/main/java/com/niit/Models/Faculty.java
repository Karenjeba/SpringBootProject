package com.niit.Models;

import java.util.List;

public class Faculty {
	
	private String factId;
	
	private List<Course> courses;
	private String factName;
	public String getFactId() {
		return factId;
	}
	public void setFactId(String factId) {
		this.factId = factId;
	}
	
	public String getFactName() {
		return factName;
	}
	public void setFactName(String factName) {
		this.factName = factName;
	}
	public Faculty()
	{
		
	}
	
	 public List<Course> getCourses() { return courses; } 
	 public void setCourses(List<Course> courses) { this.courses = courses; }
	
	
	
}
