package com.springrest.springrest.controller;
import com.springrest.springrest.entities.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to courses application";
    }

    @GetMapping("/house")
    public String house() {
        return "Welcome to House application";
    }

    //get the courses
    public List<Course> getCourses;
}