package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

@Entity
@Table(name="sw_group")
public class SwGroup {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="GROUP_PK_ID")
    private Integer groupPkId;

    @Column(name="GROUP_NAME")
    private String groupName;

    @Column(name="GROUP_DESC")
    private String groupDesc;

    public Integer getGroupPkId() {
        return groupPkId;
    }

    public void setGroupPkId(Integer groupPkId) {
        this.groupPkId = groupPkId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }
}
