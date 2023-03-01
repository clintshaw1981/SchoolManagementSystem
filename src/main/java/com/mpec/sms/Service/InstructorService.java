package com.mpec.sms.Service;


import com.mpec.sms.Model.Instructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public interface InstructorService  {
    List<Instructor> getAllInstructors();
    Instructor saveInstructor(Instructor instructor);
    Instructor getInstructorById(Long id);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructorById(Long id);
}
