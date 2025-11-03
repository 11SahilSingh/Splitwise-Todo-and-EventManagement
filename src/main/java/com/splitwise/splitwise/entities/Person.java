package com.splitwise.splitwise.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "t_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERSON_PK_ID")
    private Integer personPkId;

    @Column(name="STUDENT_FK_ID")
    private Integer studentFkId;

    @Column(name="PERSON_NAME")
    private String personName;

    @Column(name="AGE")
    private Integer age;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CITY")
    private String city;

    @Transient
    private String action;

    public Integer getPersonPkId() {
        return personPkId;
    }

    public void setPersonPkId(int personPkId) {
        this.personPkId = personPkId;
    }

    public Integer getStudentFkId() {
        return studentFkId;
    }

    public void setStudentFkId(int studentFkId) {
        this.studentFkId = studentFkId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
