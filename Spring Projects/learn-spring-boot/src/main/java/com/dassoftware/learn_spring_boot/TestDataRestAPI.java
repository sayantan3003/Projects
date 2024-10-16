package com.dassoftware.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class
 */

@RestController
public class TestDataRestAPI {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Mathematics", "P. Nag"),
                new Course(2, "History", "Romila Thapar"),
                new Course(3, "Evolution", "Charles Darwin"),
                new Course(4, "Database Design", "Korth")
        );
    }
}

