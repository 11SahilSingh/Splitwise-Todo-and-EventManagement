package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name="t_onboard")

public class OnBoardData {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ONBOARD_PK_ID")
    private Integer onboardPkId;

    @Column(name="ONBOARD_NAME")
    private String onboardName;

    @Column(name="USER_FK_ID")
    private Integer userFkId;

    @Column(name="CREATED_DATE_TIME")
    private String createdDateTime;

    public Integer getOnboardPkId() {
        return onboardPkId;
    }

    public void setOnboardPkId(Integer onboardPkId) {
        this.onboardPkId = onboardPkId;
    }

    public String getOnboardName() {
        return onboardName;
    }

    public void setOnboardName(String onboardName) {
        this.onboardName = onboardName;
    }

    public Integer getUserFkId() {
        return userFkId;
    }

    public void setUserFkId(Integer userFkId) {
        this.userFkId = userFkId;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}

