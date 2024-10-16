package com.dassoftware.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dassoftware.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
				INSERT INTO course(id, name, author)
				VALUES (?, ?, ?)
			"""
			;
	
	private static String DELETE_QUERY = 
			"""
				DELETE FROM course 
				WHERE id = ?
			"""
			;
	
	private static String SELECT_QUERY = 
			"""
				SELECT * FROM course 
				WHERE id = ?
			"""
			;
	
	public void insert(Course course) {
		springJdbcTemplate.update( CourseJdbcRepository.INSERT_QUERY, course.getId(), course.getName(), course.getAuthor() );
	}
	
	public void deleteById( long id ) {
		springJdbcTemplate.update( CourseJdbcRepository.DELETE_QUERY, id );
	}
	
	public Course findById(long id) {
		// ResultSet -> Bean => Row Mapper
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
