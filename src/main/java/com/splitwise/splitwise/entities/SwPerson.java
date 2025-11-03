package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sw_person")
public class SwPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_PK_ID")
    private Integer personPkId;

    @Column(name="PERSON_NAME")
    private String personName;



    public Integer getPersonPkId() {
        return personPkId;
    }

    public void setPersonPkId(Integer personPkId) {
        this.personPkId = personPkId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
