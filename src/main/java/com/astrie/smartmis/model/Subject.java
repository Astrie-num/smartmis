package com.astrie.smartmis.model;


import jakarta.persistence.*;

@Embeddable

public class Subject {

    private String subject_name;
    private String subject_department;

    public Subject() {
    }

    public Subject( String subject_name, String subject_department) {
        this.subject_name = subject_name;
        this.subject_department = subject_department;
    }


    public String getName() {
        return subject_name;
    }

    public void setName(String name) {
        this.subject_name = name;
    }

    public String getDepartment() {
        return subject_department;
    }

    public void setDepartment(String subject_department) {
        this.subject_department = subject_department;
    }
}