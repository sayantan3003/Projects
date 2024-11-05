package com.example.learn_springboot_project.model.dao;

public class Course {
	private int id;
	private String subject;
	private String teacher;

	public Course() {
		super();
	}

	public Course(int id, String subject, String teacher) {
		super();
		this.id = id;
		this.subject = subject;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", subject=" + subject + ", teacher=" + teacher + "]";
	}
}
