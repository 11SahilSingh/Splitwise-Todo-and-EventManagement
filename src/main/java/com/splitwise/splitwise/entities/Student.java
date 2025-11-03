package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table (name="t_student_table")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_PK_ID")
    private Integer studentPkId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    public Integer getStudentPkId() {
        return studentPkId;
    }

    public void setStudentPkId(Integer studentPkId) {
        this.studentPkId = studentPkId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
