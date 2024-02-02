package com.rest.apiproject.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.apiproject.entity.courses;

//aauta yesto method ho, jasma function hunxa [Yo kina garre ko vanda loose coupling ko lagi]
@Service
public class courseServiceimpl implements courseServicesInterface {
	
	List<courses> list;
	
	public courseServiceimpl() {
		
		list = new ArrayList<>();
		 
		list.add(new courses(256,"Subash is hero","How to become Hero like Subash"));
		list.add(new courses(4070,"Codeing is easy","make your coding journer easy by making super animal work like crazy"));
		
	}
	
	

	@Override
	public List<courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public courses getonecourse(long courseid) {
courses c = null;
		
		for(courses course:list) {
			
			if(course.getId()== courseid) {
				c = course;
				break;
			}
			
		}
		return c;
	}



	@Override
	public courses addcourse(courses courses) {
		list.add(courses);
		return courses;
	}



	@Override
	public courses updatecourse(long courseid) {
		// TODO Auto-generated method stub
courses c = null;
		
		for(courses course:list) {
			
			if(course.getId()== courseid) {
				
				break;
			}
			
		}
		return c;
	}






}