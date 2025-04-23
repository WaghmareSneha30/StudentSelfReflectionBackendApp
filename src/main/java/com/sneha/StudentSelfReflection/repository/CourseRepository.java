package com.sneha.StudentSelfReflection.repository;

import com.sneha.StudentSelfReflection.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
