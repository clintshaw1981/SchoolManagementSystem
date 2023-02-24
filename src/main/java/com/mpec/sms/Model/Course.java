package com.mpec.sms.Model;

import jakarta.persistence.*;
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "course_name", nullable = false)
    private String courseName;
    @Column(name = "content")
    private String content;

    public Course() {

    }
    public Course(Long id, String courseName, String content) {
        super();
        this.id = id;
        this.courseName = courseName;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



