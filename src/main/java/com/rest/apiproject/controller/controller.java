package com.rest.apiproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.apiproject.entity.courses;
import com.rest.apiproject.services.courseServicesInterface;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class controller {
	  private static final Logger logger = LoggerFactory.getLogger(controller.class);
	@Autowired
	private courseServicesInterface coursewalaservice;
	
	@GetMapping("/subash")
	public String subash() {
		return "Thank god, made is happy";
	}
	
	@GetMapping("/courses")
	public List<courses> getCourses(){
	
	 return this.coursewalaservice.getCourses();	
	}
	
	
@GetMapping("/courses/{courseid}")
public courses getonecourse(@PathVariable("courseid") String courseid) {
	
	 logger.info("Attempting to retrieve course with ID: {}", courseid);
     courses course = this.coursewalaservice.getonecourse(Long.parseLong(courseid));
     if (course != null) {
         logger.info("Retrieved course: {}", course);
     } else {
         logger.warn("Course with ID {} not found", courseid);
     }
	
	
 return this.coursewalaservice.getonecourse(Long.parseLong(courseid));
}

@PostMapping("/courses")
public courses addcourse(@RequestBody courses courses) {
	
	return this.coursewalaservice.addcourse(courses);
}

@PutMapping("/courses/{courseid}")
public courses updaCourses(@PathVariable("courseid") String courseid) {

	return this.coursewalaservice.updatecourse(Long.parseLong(courseid));
	
}

	
}
