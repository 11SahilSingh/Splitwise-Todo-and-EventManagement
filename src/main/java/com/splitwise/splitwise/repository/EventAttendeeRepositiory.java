package com.splitwise.splitwise.repository;

import com.splitwise.splitwise.entities.Event;
import com.splitwise.splitwise.entities.EventAttendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventAttendeeRepositiory extends JpaRepository<EventAttendee,Integer> {


    List<Event> findByEventAttendeePkId(Integer id);

    void deleteByEventAttendeePkId(Integer id);


    @Modifying
    @Query(value="UPDATE event_attendee SET  PERSON_FK_ID=:personFkId,EVENT_FK_ID=:eventFkId WHERE EVENT_ATTENDEE_PK_ID=:eventAttendeePkId",nativeQuery = true)
    void updateEventAttendeeData(Integer eventAttendeePkId, Integer personFkId, Integer eventFkId);

    List<EventAttendee> findByEventFkId(Integer eventPkId);
}
