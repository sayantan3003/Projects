package com.dassoftware.rest.webservices.restful_web_services.controller;

import com.dassoftware.rest.webservices.restful_web_services.dao.User;
import com.dassoftware.rest.webservices.restful_web_services.dao.UserRepository;
import com.dassoftware.rest.webservices.restful_web_services.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class SocialMediaController {
//    @RequestMapping(method = RequestMethod.GET, path = "/Hello-world")
    @GetMapping(path = "/Hello")
    public String helloWorld() { 
        return "Hello World";
    }

    @GetMapping(path = "/Hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/Hello/{name}")
    public String helloWorld(@PathVariable String name) {
        return "Hello " + name;
    }


    private SocialMediaService socialMedia;

    @Autowired
    public SocialMediaController( SocialMediaService socialMedia ) {
        this.socialMedia = socialMedia;
    }

    @GetMapping(path="/users")
    public List<User> getUsers() {
        List<User> users = socialMedia.retriveUsers();
        users.forEach(System.out::println);
        return users;
    }

    @PostMapping(path="/users/add")
    public void addUser(@RequestParam String name) {
        socialMedia.addUser(new User( name, new Date() ));
    }

    @GetMapping(path="/users/{id}")
    public User getUserById(@PathVariable String id) {
        return socialMedia.getUserById( Integer.parseInt(id) );
    }
}
