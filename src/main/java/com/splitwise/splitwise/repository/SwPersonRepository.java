package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.SwPerson;
import org.hibernate.sql.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SwPersonRepository extends JpaRepository<SwPerson,Integer> {

    SwPerson findByPersonPkId(Integer personPkId);

    @Modifying
    @Query(value = " update sw_person set PERSON_NAME=:personName where PERSON_PK_ID=:personPkId ",nativeQuery = true)
    void updateSwPersonData(Integer personPkId, String personName);
}
