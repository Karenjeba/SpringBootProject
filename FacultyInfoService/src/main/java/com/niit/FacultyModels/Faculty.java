package com.niit.FacultyModels;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Faculty {
	@Id
	private String factId;
	@OneToMany
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
