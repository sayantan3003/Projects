package com.dassoftware.rest.webservices.restful_web_services.service;

import com.dassoftware.rest.webservices.restful_web_services.dao.User;
import com.dassoftware.rest.webservices.restful_web_services.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class SocialMediaService {
    @Autowired
    private UserRepository user;

    public SocialMediaService() {
    }

    public UserRepository getUser() {
        return user;
    }

    public void setUser(UserRepository user) {
        this.user = user;
    }

    public void addUser(User user) {
        this.user.save(user);
    }

    public void removeUserByName(String name) {
        this.user.delete(user.findByName( name ).getFirst());
    }

    public List<User> retriveUsers() {
        return user.findAll();
    }

    public User getUserById(int id) {
        return user.findById(id).get();
    }
}
