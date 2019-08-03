package com.niit.FacultyControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.niit.FacultyModels.Course;
import com.niit.FacultyModels.Faculty;
import com.niit.FacultyServices.FacultyService;



@RestController
@RequestMapping("/faculty")
public class FacultyController 
{	@Autowired
	private FacultyService service;
	@RequestMapping("/home")
	public ModelAndView welcome() 
	{ 
		ModelAndView model = new ModelAndView();
		model.setViewName("home"); 
		return model; 
	 }
	@RequestMapping("/add")
	public ModelAndView courseAdd()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("course");
		return model;
	}
	@RequestMapping("/addCourse")
	public ModelAndView course(Course course)
	{
		service.addCourse(course);
		ModelAndView model = new ModelAndView();
		 model.setViewName("showCourse");
		return model;
	}	
	@RequestMapping("/getAllCourses")
	public ModelAndView getAllCourse()
	{
		List<Course> courselist =  service.getAllCourses();
		ModelAndView model = new ModelAndView();
		model.addObject("courselist",courselist);
		model.setViewName("showCourse");
		return model;
		
	}	
	@RequestMapping("/courselist")
	@ResponseBody
	public List<Course> getAllCourses()
	{
	return service.getAllCourses();
			
	}
	@RequestMapping("/courselist/{courseId}")
	@ResponseBody
	public Course getCourseByIdParam(@PathVariable String courseId)
	{
	return service.getCourseById(courseId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/addCourses") 
	public void addCourse(@RequestBody Course course) 
	{ 
		service.addCourse(course); 
	}
	
	@RequestMapping("/faculty/{factId}")
	@ResponseBody
	public Faculty getFacultyById(@PathVariable String factId)
	{
	return service.getFacultyById(factId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/addFaculty") 
	public void addFaculty(@RequestBody Faculty fact) 
	{ 
		service.addFaculty(fact);
	}
	
	@RequestMapping("/facultylist")
	@ResponseBody
	public List<Faculty> getAllFaculty()
	{
	return service.getAllFaculty();
			
	}
	
	
	
	
}
