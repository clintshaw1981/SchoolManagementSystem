package com.mpec.sms.Service.Impl;

import com.mpec.sms.Model.Instructor;
import com.mpec.sms.Repository.InstructorRepository;
import com.mpec.sms.Service.InstructorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {
    private InstructorRepository instructorRepository;
    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        super();
        this.instructorRepository = instructorRepository;
    }
    @Override
    public List<Instructor>getAllInstructors() {
        return instructorRepository.findAll();
    }
    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.findById(id).get();
    }
    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
    @Override
    public void deleteInstructorById(Long id) {
        instructorRepository.deleteById(id);
    }
}
