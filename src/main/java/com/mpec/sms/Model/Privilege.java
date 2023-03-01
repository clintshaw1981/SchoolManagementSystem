package com.mpec.sms.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles;
}
