package com.sneha.StudentSelfReflection.controller;

import com.sneha.StudentSelfReflection.model.ApplicationUser;
import com.sneha.StudentSelfReflection.model.Course;
import com.sneha.StudentSelfReflection.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    // http://localhost:8080/api/v1/course/create
    @PostMapping("create")
    public ResponseEntity<Course> createCourse(@RequestBody Course course)
    {
        Course savedCourse = courseService.createCourse(course);
        return new ResponseEntity<>(savedCourse,HttpStatus.CREATED);
    }
}
