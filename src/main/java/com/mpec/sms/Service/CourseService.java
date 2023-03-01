package com.mpec.sms.Service;

import com.mpec.sms.Model.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public interface CourseService {
    List<Course> getAllCourses();
    Course saveCourse(Course course);
    Course getCourseById(Long id);
    Course updateCourse(Course course);
    void deleteCourseById(Long id);
}
