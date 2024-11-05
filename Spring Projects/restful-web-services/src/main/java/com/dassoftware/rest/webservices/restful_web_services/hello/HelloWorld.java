package com.dassoftware.rest.webservices.restful_web_services.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
//    @RequestMapping(method = RequestMethod.GET, path = "/Hello-world")
    @GetMapping(path = "/Hello-world")
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

    
}
