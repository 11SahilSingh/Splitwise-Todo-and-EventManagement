package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sw_group_member")
public class SwGroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="GROUPMEMBER_PK_ID")
    private Integer groupMemberPkId;

    @Column(name="GROUP_FK_ID")
    private Integer groupFkId;

    @Column(name="PERSON_FK_ID")
    private Integer personFkId;

    @Transient
    List<SwPerson> swPersonList;

    public Integer getGroupMemberPkId() {
        return groupMemberPkId;
    }

    public void setGroupMemberPkId(Integer groupMemberPkId) {
        this.groupMemberPkId = groupMemberPkId;
    }

    public Integer getGroupFkId() {
        return groupFkId;
    }

    public void setGroupFkId(Integer groupFkId) {
        this.groupFkId = groupFkId;
    }

    public Integer getPersonFkId() {
        return personFkId;
    }

    public void setPersonFkId(Integer personFkId) {
        this.personFkId = personFkId;
    }

    public List<SwPerson> getSwPersonList() {
        return swPersonList;
    }
    public void setSwPersonList(List<SwPerson> swPersonList) {
        this.swPersonList = swPersonList;
    }
}

