package com.rest.apiproject.services;

import java.util.List;

import com.rest.apiproject.entity.courses;

//major area ho, jasle declare garxa

public interface courseServicesInterface {

	public List<courses> getCourses();

	public courses getonecourse(long courseid);

	public courses addcourse(courses courses);
	
	public courses updatecourse(long courseid);
	
	
}
