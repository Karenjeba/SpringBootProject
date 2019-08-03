package com.niit.FacultyRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.FacultyModels.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
