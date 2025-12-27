package com.splitwise.splitwise.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "t_user_insurance")
public class UserInsurance {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "INSURANCE_PK_ID", strategy = "uuid2")
    private UUID insurancePkId;

    @Column(name = "PERSON_FK_ID")
    private UUID personFkId;

    @Column(name="INSURANCE_NAME")
    private String insuranceName;

    @Column(name = "DESC")
    private String desc;

    public UUID getInsurancePkId() {
        return insurancePkId;
    }

    public void setInsurancePkId(UUID insurancePkId) {
        this.insurancePkId = insurancePkId;
    }

    public UUID getPersonFkId() {
        return personFkId;
    }

    public void setPersonFkId(UUID personFkId) {
        this.personFkId = personFkId;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Transient
    private String userName="";

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
