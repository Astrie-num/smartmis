package com.astrie.smartmis.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Janitors")
public class Janitors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="janitorid")
    private int id ;
    private String lname;
    private String fname;
    private String email;
    private int age;

    public Janitors() {
    }

    public Janitors( String lname, String fname, String email, int age) {
        this.lname = lname;
        this.fname = fname;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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

    public void setAge(int age) {
        this.age = age;
    }
}
