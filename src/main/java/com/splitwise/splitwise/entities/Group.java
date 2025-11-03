package com.splitwise.splitwise.entities;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name="t_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="GROUP_PK_ID")
    private Integer groupPkId;

    @Column(name="GROUP_NAME")
    private String groupName;

    @Column(name="GROUP_IMAGE")
    private String groupImage;

    @Column(name="CREATED_DATE_TIME")
    private Date createdDateTime;

    public int getGroupPkId() {
        return groupPkId;
    }

    public void setGroupPkId(int groupPkId) {
        this.groupPkId = groupPkId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupImage() {
        return groupImage;
    }

    public void setGroupImage(String groupImage) {
        this.groupImage = groupImage;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
