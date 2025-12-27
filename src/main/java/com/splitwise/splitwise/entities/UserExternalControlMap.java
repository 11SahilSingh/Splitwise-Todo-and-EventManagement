package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "USER_EXTERNAL_CONTROL_MAP")
public class UserExternalControlMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_EXTERNAL_CONTROL_MAP_PK_ID")
    private UUID userExternalControlMapPkId;

    @Column(name = "UAR_FK_ID")
    private UUID uarFkId;

    @Column(name = "EXTERNAL_NAME")
    private String externalName;

    @Column(name = "OBJECT_CODE")
    private String objectCode;

    public UUID getUserExternalControlMapPkId() {
        return userExternalControlMapPkId;
    }

    public void setUserExternalControlMapPkId(UUID userExternalControlMapPkId) {
        this.userExternalControlMapPkId = userExternalControlMapPkId;
    }

    public UUID getUarFkId() {
        return uarFkId;
    }

    public void setUarFkId(UUID uarFkId) {
        this.uarFkId = uarFkId;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }
}
