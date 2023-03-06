package com.mpec.sms.Model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
    @Table(name = "students")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        @Column(name = "first_name", nullable = false)
        private String firstName;
        @Column(name = "last_name")
        private String lastName;
        @Column(name = "address")
        private String address;
        @Column(name = "email")
        private String email;
        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(
                name = "course_details",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name = "course_id")
        )
        private Set<Course> courses = new HashSet<>();
        public Student() {
            super();
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.email = email;
        }

        public void setId(Long id) {
            this.id = id;
        }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


}


