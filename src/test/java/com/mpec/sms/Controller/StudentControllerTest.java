package com.mpec.sms.Controller;

import com.mpec.sms.Model.Student;
import com.mpec.sms.Repository.StudentRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;

import java.util.List;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentControllerTest {
    @Autowired
    StudentRepository studentRepository;

    @Test
    @Order(1)
    void createStudentForm() {
        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Bob");
        student.setLastName("Li");
        student.setAddress("33 lent avenue");
        student.setEmail("bob@jk.com");
        studentRepository.save(student);
        assertNotNull(studentRepository.findById(1L));
    }
    @Test
    @Order(2)
    void listStudents() {
        List list = studentRepository.findAll();
        assertThat(list).size().isGreaterThan(0);
    }
    @Test
    @Order(3)
    void editStudentForm() {
        Student student = studentRepository.findById(1L).get();
        student.setEmail("BLi@yahoo.com");
        studentRepository.save(student);
        assertNotEquals("bob@jk.com", studentRepository.findById(1L).get().getEmail());
    }

    @Test
    @Order(4)
    void deleteStudent() {
        studentRepository.deleteById(1L);
        assertThat(studentRepository.existsById(1L)).isFalse();
    }
}