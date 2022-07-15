package com.springrest.springrest.service;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceimpl implements CourseService{

    List<Course> list;

    public CourseServiceimpl(){

        list=new ArrayList<>();
        list.add(new Course(220,"Data Structure","this course introduces to the analysis of algorithms to process the basic structure"));
        list.add(new Course(221,"Algorithms","this course introduces to the efficient algorithms and effective algorithm design techniques"
        ));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {

        Course c = null;
        for (Course course : list) {
            if (course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

}


