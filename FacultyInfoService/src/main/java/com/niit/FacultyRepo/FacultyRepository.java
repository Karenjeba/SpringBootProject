package com.niit.FacultyRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.FacultyModels.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, String> {

}
