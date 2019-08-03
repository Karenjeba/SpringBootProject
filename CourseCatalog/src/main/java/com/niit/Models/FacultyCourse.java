package com.niit.Models;

import java.util.List;

public class FacultyCourse 
{
	
	private String factName;
	private List<Course> course;
	private int feedbackrating;
	
	public int getFeedbackrating() {
		return feedbackrating;
	}
	public void setFeedbackrating(int feedbackrating) {
		this.feedbackrating = feedbackrating;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public FacultyCourse()
	{
		
	}
	
	public String getFactName() {
		return factName;
	}
	public void setFactName(String factName) {
		this.factName = factName;
	}
	
	

}
