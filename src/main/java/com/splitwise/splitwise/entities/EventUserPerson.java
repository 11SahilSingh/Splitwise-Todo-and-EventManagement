package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table (name="t_user_person")
public class EventUserPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERSON_PK_ID")
    private Integer personPkId;

    @Column(name="PERSON_NAME")
    private String personName;

    @Column(name="PERSON_DESIGNATION")
    private String personDesignation;

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

    public String getPersonDesignation() {
        return personDesignation;
    }

    public void setPersonDesignation(String personDesignation) {
        this.personDesignation = personDesignation;
    }
}
