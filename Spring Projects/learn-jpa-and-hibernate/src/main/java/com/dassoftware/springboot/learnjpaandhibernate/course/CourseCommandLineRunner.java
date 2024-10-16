package com.dassoftware.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dassoftware.springboot.learnjpaandhibernate.course.Course;
import com.dassoftware.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.dassoftware.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.dassoftware.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired 
	private CourseJdbcRepository repository;

	@Autowired
	private CourseJpaRepository jpaRepo;
	
	@Autowired
	private CourseSpringDataJpaRepository jpaDataRepo;

	@Override
	public void run(String... args) throws Exception {
		
		repository.insert(new Course(1, "Bengali", "A. Bhattacharya"));
		repository.insert(new Course(2, "English", "Durga De"));
		repository.insert(new Course(3, "Mathematics", "P. banerjee"));
		
		repository.deleteById(2);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(3));

		jpaRepo.insert(new Course(4, "History", "TSRC"));
		jpaRepo.insert(new Course(5, "Geography", "A. Mondal"));
		jpaRepo.insert(new Course(6, "Physical Science", "A. Das"));

		jpaRepo.deleteById(5);

		System.out.println(jpaRepo.findById(1));
		System.out.println(jpaRepo.findById(4));
		System.out.println(jpaRepo.findById(6));
		
		jpaDataRepo.save(new Course(7, "Life Science", "Tuhin Rudra"));
		jpaDataRepo.save(new Course(8, "Physical Education", "P. Saha"));
		jpaDataRepo.save(new Course(9, "Work Education", "A. Adhikary"));
		
		jpaDataRepo.deleteById(8l);
		
		System.out.println(jpaDataRepo.findById(7l));
		System.out.println(jpaDataRepo.findById(9l));
		System.out.println(jpaDataRepo.findById(1l));
		
		System.out.println(jpaDataRepo.findAll());
		
		System.out.println(jpaDataRepo.findByAuthor("A. Das"));
		System.out.println(jpaDataRepo.findByAuthor(""));
	}

}
