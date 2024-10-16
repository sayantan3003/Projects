package com.dassoftware.learn_spring_boot;

/**
 * Model class
 */

public class Course {
	private int id;
	private String course;
	private String teacher;
	
	public Course(int id, String course, String teacher) {
		super();
		this.id = id;
		this.course = course;
		this.teacher = teacher;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCourse() {
		return course;
	}
	
	public String getTeacher() {
		return teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", teacher=" + teacher + "]";
	}
}
