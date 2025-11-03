package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name="event_atendee")

public class EventAttendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EVENT_ATTENDEE_PK_ID")
    private Integer eventAttendeePkId;

    @Column(name="PERSON_FK_ID")
    private Integer personFkId;

    @Column(name="EVENT_FK_ID")
    private Integer eventFkId;

    @Transient
   private List<EventUserPerson> eventUserPersonList;

    public Integer getEventAttendeePkId() {
        return eventAttendeePkId;
    }

    public void setEventAttendeePkId(Integer eventAttendeePkId) {
        this.eventAttendeePkId = eventAttendeePkId;
    }

    public Integer getPersonFkId() {
        return personFkId;
    }

    public void setPersonFkId(Integer personFkId) {
        this.personFkId = personFkId;
    }

    public Integer getEventFkId() {
        return eventFkId;
    }

    public void setEventFkId(Integer eventFkId) {
        this.eventFkId = eventFkId;
    }

    public List<EventUserPerson> getEventUserPersonList() {
        return eventUserPersonList;
    }

    public void setEventUserPersonList(List<EventUserPerson> eventUserPersonList) {
        this.eventUserPersonList = eventUserPersonList;
    }
}

