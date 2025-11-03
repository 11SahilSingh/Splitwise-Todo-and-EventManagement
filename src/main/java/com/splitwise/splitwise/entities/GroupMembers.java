package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name="t_group_member")
public class GroupMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="GROUPMEMBER_PK_ID")
    private Integer groupMemberPkId;

    @Column(name="GROUP_FK_ID")
    private int groupFkId;

    @Column(name="USER_FK_ID")
    private String userFkId;

    @Column(name="CREATED_DATE_TIME")
    private Date createdDateTime;

    public int getGroupMemberPkId() {
        return groupMemberPkId;
    }

    public void setGroupMemberPkId(Integer groupMemberPkId) {
        this.groupMemberPkId = groupMemberPkId;
    }

    public int getGroupFkId() {
        return groupFkId;
    }

    public void setGroupFkId(int groupFkId) {
        this.groupFkId = groupFkId;
    }

    public String getUserFkId() {
        return userFkId;
    }

    public void setUserFkId(String userFkId) {
        this.userFkId = userFkId;
    }

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
