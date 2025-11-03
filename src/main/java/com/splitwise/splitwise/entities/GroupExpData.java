package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="t_group_exp_data")
public class GroupExpData {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="GROUP_EXP_DATA_PK_ID")
    private Integer groupExpDataPkId;

    @Column(name="TITTLE")
    private String title;

    @Column(name="AMOUNT_PAID")
    private Integer amountPaid;

    @Column(name="PAID_BY_USER_FK_ID")
    private String paidByUserFkId;

    @Column(name="CREATED_DATE_TIME")
    private Date createdDateTime;

    public Integer getGroupExpDataPkId() {
        return groupExpDataPkId;
    }

    public void setGroupExpDataPkId(Integer groupExpDataPkId) {
        this.groupExpDataPkId = groupExpDataPkId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getPaidByUserFkId() {
        return paidByUserFkId;
    }

    public void setPaidByUserFkId(String paidByUserFkId) {
        this.paidByUserFkId = paidByUserFkId;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
