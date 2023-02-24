package com.mpec.sms.Service;


import com.mpec.sms.Model.Instructor;

import java.util.List;

public interface InstructorService {
    List<Instructor> getAllInstructors();
    Instructor saveInstructor(Instructor instructor);
    Instructor getInstructorById(Long id);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructorById(Long id);
}
