package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.SwGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SwGroupRepository extends JpaRepository<SwGroup,Integer> {

    List<SwGroup> findByGroupPkId(Integer groupPkId);

    @Modifying
    @Query(value="Update sw_group set GROUP_NAME=:groupName,GROUP_DESC=:groupDesc where GROUP_PK_ID=:groupPkId",nativeQuery = true)
    void updateGroupData(Integer groupPkId, String groupName, String groupDesc);

}
