package com.splitwise.splitwise.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="event_table")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_PK_ID")
    private Integer eventPkId;

    @Column(name="EVENT_TITLE")
    private String eventTitle;

    @Column(name="EVENT_DESC")
    private String eventDesc;

    @Column(name="EVENT_START_DATETIME")
    private String eventStartDateTime;

    @Column(name="EVENT_END_DATETIME")
    private String eventEndDateTime;

    @Column(name="EVENT_LOCATION")
    private String eventLocation;

    @Transient
    List<EventAttendee> eventAttendeeList;

    public Integer getEventPkId() {
        return eventPkId;
    }

    public void setEventPkId(Integer eventPkId) {
        this.eventPkId = eventPkId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getEventStartDateTime() {
        return eventStartDateTime;
    }

    public void setEventStartDateTime(String eventStartDateTime) {
        this.eventStartDateTime = eventStartDateTime;
    }

    public String getEventEndDateTime() {
        return eventEndDateTime;
    }

    public void setEventEndDateTime(String eventEndDateTime) {
        this.eventEndDateTime = eventEndDateTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public List<EventAttendee> getEventAttendeeList() {
        return eventAttendeeList;
    }

    public void setEventAttendeeList(List<EventAttendee> eventAttendeeList) {
        this.eventAttendeeList = eventAttendeeList;
    }
}

