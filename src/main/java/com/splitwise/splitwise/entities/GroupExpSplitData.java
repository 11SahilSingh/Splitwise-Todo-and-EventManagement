package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name="t_group_exp_spit_data")
public class GroupExpSplitData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="GROUP_EXP_SPLIT_DATA_PK_ID")
    private int groupExpSplitDataPkId;

    @Column(name="GROUP_EXP_DATA_FK_ID")
    private int groupExpDataFkId;

    @Column(name="SPLITED_USER_FK_ID")
    private String splittedUserFkId;

    public int getGroupExpSplitDataPkId() {
        return groupExpSplitDataPkId;
    }

    public void setGroupExpSplitDataPkId(int groupExpSplitDataPkId) {
        this.groupExpSplitDataPkId = groupExpSplitDataPkId;
    }

    public int getGroupExpDataFkId() {
        return groupExpDataFkId;
    }

    public void setGroupExpDataFkId(int groupExpDataFkId) {
        this.groupExpDataFkId = groupExpDataFkId;
    }

    public String getSplittedUserFkId() {
        return splittedUserFkId;
    }

    public void setSplittedUserFkId(String splittedUserFkId) {
        this.splittedUserFkId = splittedUserFkId;
    }
}


