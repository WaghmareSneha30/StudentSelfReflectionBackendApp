package com.sneha.StudentSelfReflection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PersonalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personalInfoId;

    private String collegeName;
    private String branch;
    private String courseName;
    private String passingYear;

}
