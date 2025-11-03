package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.Event;
import com.splitwise.splitwise.entities.EventAttendee;
import com.splitwise.splitwise.entities.EventUserPerson;
import java.util.List;

public interface EventService {
    List<Event> getEventData(String eventPkId);

    void postEventData(Event event);

    void deleteEventData(String eventPkId);

    void updateEventData(Event event);

    List<Event> getEventAttendeeData(String eventAttendeePkId);

    void postEventAttendeeData(EventAttendee eventAttendee);

    void deleteEventAttendeeData(String eventAttendeePkId);

    void updateEventAttendeeData(EventAttendee eventAttendee);

    List<EventUserPerson> getEventUserPersonData(String personPkId);

    void postEventUserPersonData(EventUserPerson eventUserPerson);

    void deleteEventUserPersonData(String personPkId);

    void updateEventUserPersonData(EventUserPerson eventUserPerson);
}
