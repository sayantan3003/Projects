package com.example.learn_springboot_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn_springboot_project.model.dao.Course;
import com.example.learn_springboot_project.service.CourceJDBCRepositoryService;

@RestController
public class CourseController implements CommandLineRunner {
	
	/*
	 * @RequestMapping("/course") public List<Course> retriveAllCourses() { return
	 * Arrays.asList( new Course(1, "Bengali", "A. Bhattacharya"), new Course(2,
	 * "English", "Durga Dey"), new Course(3, "Math", "Pallab Banerjee") ); }
	 */
	@Autowired
	private CourceJDBCRepositoryService jdbcRepoService;
	
	@RequestMapping("/course")
	public List<Course> retriveCoursesFromSpringJdbc() {
		return jdbcRepoService.get();
	}

	@Override
	public void run(String... args) throws Exception {
		jdbcRepoService.insert(new Course(1, "Bengali", "A. Bhattacharya"));
		jdbcRepoService.insert(new Course(2, "English", "Durga Dey"));
		jdbcRepoService.insert(new Course(3, "Math", "P. Banerjee"));
		
		jdbcRepoService.remove(0);
		jdbcRepoService.remove(2);
		
		System.out.println(jdbcRepoService.findById(1));
	}
	
	
}
