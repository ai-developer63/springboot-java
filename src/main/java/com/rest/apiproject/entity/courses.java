package com.rest.apiproject.entity;



//Course ko structure designer ho hai
public class courses {

	private long id;
	private String Title;
	private String description;
	public courses(long id, String title, String description) {
		super();
		this.id = id;
		Title = title;
		this.description = description;
	}
	public courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "courses [id=" + id + ", Title=" + Title + ", description=" + description + "]";
	}
	
	
	
	
}
