package com.springrest.springrest.controller;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home() {
        return "Welcome to courses application";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){

        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);


    }
}