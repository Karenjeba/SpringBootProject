package com.niit.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating 
{
	@Id
private String factId;
private int rating;
public Rating()
{
	
}
public String getFactId() {
	return factId;
}
public void setFactId(String factId) {
	this.factId = factId;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

}
