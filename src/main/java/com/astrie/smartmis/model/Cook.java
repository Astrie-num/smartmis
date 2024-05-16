package com.astrie.smartmis.model;

import jakarta.persistence.*;


@Entity
@Table(name="cooks")
public class Cook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String fname;
    private String lname;
    private String email;
    private int age;


    public Cook() {
    }

    public Cook( String fname, String lname, String email, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

}
