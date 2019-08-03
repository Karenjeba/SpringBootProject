package com.niit.CourseCatalogControllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.niit.CatalogService.RatingService;
import com.niit.Models.Faculty;
import com.niit.Models.FacultyCourse;
import com.niit.Models.Rating;



@RestController
@RequestMapping("/catalog")
public class CourseCatalogServiceController 
{	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private RatingService ratingservice;
	@RequestMapping("/faculty/{factId}") 
	public FacultyCourse getCatalog(@PathVariable("factId") String factId)
	{
		Faculty f = restTemplate.getForObject("http://faculty-info-service/faculty/faculty/"+factId, Faculty.class);
		FacultyCourse fc = new FacultyCourse();
		Rating r = ratingservice.getRatingById(factId);
		fc.setFeedbackrating(r.getRating());
		fc.setCourse(f.getCourses());
		fc.setFactName(f.getFactName());
		return fc;
	}
	
	


}
