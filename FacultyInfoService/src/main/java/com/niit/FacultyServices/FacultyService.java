package com.niit.FacultyServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.FacultyModels.Course;
import com.niit.FacultyModels.Faculty;
import com.niit.FacultyRepo.CourseRepository;
import com.niit.FacultyRepo.FacultyRepository;

@Service
public class FacultyService 
{
	@Autowired
	private FacultyRepository frepo;
	@Autowired
	private CourseRepository crepo;
	
	public List<Course> getAllCourses() 
	{
		List<Course> courseList = new ArrayList<>();
		crepo.findAll().forEach(courseList::add);
		return courseList;
	}

	public Course getCourseById(String courseId)
	{
		return crepo.findById(courseId).orElse(new Course());
	}

	public void addCourse(Course course) 
	{
		crepo.save(course);
		
	}
	
	public List<Faculty> getAllFaculty()
	{
		List<Faculty> facultyList = new ArrayList<>();
		frepo.findAll().forEach(facultyList::add);
		return facultyList;
	}
	
	public void addFaculty(Faculty fact)
	{
		frepo.save(fact);
	}
	
	public Faculty getFacultyById(String factId)
	{
		return frepo.findById(factId).orElse(new Faculty());
	}
}
