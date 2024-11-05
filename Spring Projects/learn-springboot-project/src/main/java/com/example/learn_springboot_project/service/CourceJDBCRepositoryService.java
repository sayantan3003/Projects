package com.example.learn_springboot_project.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.learn_springboot_project.model.dao.Course;


@Service
public class CourceJDBCRepositoryService {
	
	@Autowired
	private JdbcTemplate springJDBCTemplate;
	
	private String Insert_Query = 
			"""
				INSERT INTO course (id, subject, teacher)
				VALUES(?, ?, ?);
			""";
	
	public void insert(Course course) {
		springJDBCTemplate.update(Insert_Query, course.getId(), course.getSubject(), course.getTeacher());
	}
	
	public List<Course> get() {
		String sql = "SELECT * FROM course";
	    
	    List<Course> courses = springJDBCTemplate.query(sql, new RowMapper<Course>() {
	        public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Course course = new Course();
	            course.setId(rs.getInt("id"));
	            course.setSubject(rs.getString("subject"));
	            course.setTeacher(rs.getString("teacher"));
	            return course;
	        }
	    });
	    return courses;
	}
	
	public Course findById(int id) {
		return springJDBCTemplate.queryForObject("SELECT * FROM course WHERE id = ? ", new BeanPropertyRowMapper<>(Course.class), id);
	}
	
	public void remove(int id) {
		springJDBCTemplate.execute("DELETE FROM course WHERE id = " + id);
	}
}
