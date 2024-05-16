package com.astrie.smartmis.model;

import jakarta.persistence.*;


@Entity
@Table(name = "sections")
public class Sections {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private String section_name;

    @Embedded
    private Student student;

    public Sections() {
    }

    public Sections( String section_name, Student person) {
        this.section_name = section_name;
        this.student = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return section_name;
    }

    public void setName(String section_name) {
        this.section_name = section_name;
    }

    public Student getPerson() {
        return student;
    }

    public void setPerson(Student person) {
        this.student = person;
    }
}
