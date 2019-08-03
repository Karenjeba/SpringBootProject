package com.niit.CatalogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Models.Rating;
import com.niit.Models.RatingRepo;
@Service
public class RatingService {
	@Autowired
	private RatingRepo rating;
	
	public Rating getRatingById(String factId)
	{
		return rating.findById(factId).orElse(new Rating());
	}

}
