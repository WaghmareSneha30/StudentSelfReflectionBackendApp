package com.sneha.StudentSelfReflection.services;

import com.sneha.StudentSelfReflection.model.Course;
import com.sneha.StudentSelfReflection.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course createCourse(Course course)
    {
        Course savedCourse = courseRepository.save(course);
        return savedCourse;
    }
}
