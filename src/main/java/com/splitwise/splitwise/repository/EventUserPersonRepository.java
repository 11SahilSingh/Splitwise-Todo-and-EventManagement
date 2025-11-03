package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.EventUserPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventUserPersonRepository extends JpaRepository<EventUserPerson,Integer> {
    List<EventUserPerson> findByPersonPkId(Integer id);
    void deleteByPersonPkId(Integer id);

    @Modifying
    @Query(value="UPDATE event_attendee SET PERSON_NAME=:personName,PERSON_DESIGNATION=:personDesignation WHERE PERSON_PK_ID=:personPkId",nativeQuery = true)
    void updateEventUserPersonData(Integer personPkId, String personName, String personDesignation);
}
