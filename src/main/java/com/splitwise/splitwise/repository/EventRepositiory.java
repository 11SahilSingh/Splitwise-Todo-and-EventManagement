package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface EventRepositiory extends JpaRepository<Event,Integer> {


    ArrayList<Event> findByEventPkId(Integer id);

    void deleteByEventPkId(Integer id);

    @Modifying
    @Query(value = "UPDATE event_table SET EVENT_TITLE = :eventTitle, " +
            "EVENT_DESC = :eventDesc, " +
            "EVENT_START_DATETIME = :eventStartDateTime, " +
            "EVENT_END_DATETIME = :eventEndDateTime, " +
            "EVENT_LOCATION = :eventLocation " +
            "WHERE EVENT_PK_ID = :eventPkId",
            nativeQuery = true)
    void updateEventData(Integer eventPkId, String eventTitle, String eventDesc, String eventStartDateTime, String eventEndDateTime, String eventLocation);

}
