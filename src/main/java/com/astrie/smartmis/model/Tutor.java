package com.astrie.smartmis.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tutor")
public class Tutor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private String tutor_fname;
    private String tutor_lname;
    private int tutor_age;
    private String tutor_email;
    private String tutor_institution;

    @Embedded
    private Subject subject;


//    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
//    private Set<Subject> subjects = new HashSet<>();

    public Tutor() {
    }

    public Tutor(String tutor_fname, String tutor_lname, int tutor_age, String tutor_email, String tutor_institution, Subject subject) {
        this.tutor_fname = tutor_fname;
        this.tutor_lname = tutor_lname;
        this.tutor_age = tutor_age;
        this.tutor_email = tutor_email;
        this.tutor_institution = tutor_institution;
        this.subject = subject;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return tutor_fname;
    }

    public void setFname(String tutor_fname) {
        this.tutor_fname = tutor_fname;
    }

    public String getLname() {
        return tutor_lname;
    }

    public void setLname(String lname) {
        this.tutor_lname = lname;
    }

    public int getAge() {
        return tutor_age;
    }

    public void setAge(int age) {
        this.tutor_age = tutor_age;
    }

    public String getEmail() {
        return tutor_email;
    }

    public void setEmail(String email) {
        this.tutor_email = tutor_email;
    }

    public String getInstitution() {
        return tutor_institution;
    }

    public void setInstitution(String institution) {
        this.tutor_institution = tutor_institution;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }


}
