package com.model;

import jakarta.persistence.*;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  String id;

    @Column(nullable = false,unique = true,length = 100)
    private String name;

    @Column(nullable=false,length = 300)
    private String description;

}
