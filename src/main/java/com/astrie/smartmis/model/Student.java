package com.astrie.smartmis.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.util.List;

@Embeddable

public class Student {

//    @Column(name= "fname")
    private String student_fname;
    private String student_lname;
    private String student_email;

    @Positive
    private double student_fee;

    public Student() {
    }

    public Student(String student_fname, String student_lname, String student_email, double student_fee) {
        this.student_fname = student_fname;
        this.student_lname = student_lname;
        this.student_email = student_email;
        this.student_fee = student_fee;
    }


    public String getFname() {
        return student_fname;
    }

    public void setFname(String student_fname) {
        this.student_fname = student_fname;
    }

    public String getLname() {
        return student_lname;
    }

    public void setLname(String student_lname) {
        this.student_lname = student_lname;
    }

    public String getEmail() {
        return student_email;
    }

    public void setEmail(String student_email) {
        this.student_email = student_email;
    }

    public double getFee() {
        return student_fee;
    }

    public void setFee(double student_fee) {
        this.student_fee = student_fee;
    }


}