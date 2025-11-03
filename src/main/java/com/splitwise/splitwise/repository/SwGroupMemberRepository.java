package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.GroupMembers;
import com.splitwise.splitwise.entities.SwExpense;
import com.splitwise.splitwise.entities.SwGroupMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SwGroupMemberRepository extends JpaRepository<SwGroupMember,Integer> {

    @Modifying
    @Query(value="update sw_group_member set GROUP_FK_ID=:groupFkId,PERSON_FK_ID=:personFkId where GROUPMEMBER_PK_ID=:groupMemberPkId",nativeQuery = true)
    void updateSwGroupMemberData(int groupMemberPkId, int groupFkId, int personFkId);

    List<SwGroupMember> findByGroupMemberPkId(Integer id);
}