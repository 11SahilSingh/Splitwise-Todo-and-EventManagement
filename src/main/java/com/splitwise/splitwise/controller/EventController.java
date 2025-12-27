package com.splitwise.splitwise.controller;

import com.splitwise.splitwise.entities.Event;
import com.splitwise.splitwise.entities.EventAttendee;
import com.splitwise.splitwise.service.EventService;
import com.splitwise.splitwise.entities.EventUserPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/getEventData")
    public List<Event> getEventData(@RequestParam ("EVENT_PK_ID") String eventPkId) {
        return eventService.getEventData(eventPkId);
    }
    @PostMapping("/postEventData")
    public void postEventData(@RequestBody Event event) {
        eventService.postEventData(event);
    }
    @DeleteMapping("/deleteEventData")
    public void deleteEventData(@RequestParam ("EVENT_PK_ID") String eventPkId) {
        eventService.deleteEventData(eventPkId);
    }
    @PutMapping("/updateEventData")
    public void updateEventData(@RequestBody Event event) {
        eventService.updateEventData(event);
    }



    @GetMapping("/getEventAttendeeData")
    public List<Event> getEventAttendeeData(@RequestParam ("EVENT_ATTENDEE_PK_ID") String eventAttendeePkId) {
        return eventService.getEventAttendeeData(eventAttendeePkId);
    }
    @PostMapping("/postEventAttendeeData")
    public void postEventAttendeeData(@RequestBody EventAttendee eventAttendee) {
        eventService.postEventAttendeeData(eventAttendee);
    }
    @DeleteMapping("/deleteEventAttendeeData")
    public void deleteEventAttendeeData(@RequestParam ("EVENT_ATTENDEE_PK_ID") String eventAttendeePkId) {
        eventService.deleteEventAttendeeData(eventAttendeePkId);
    }
    @PutMapping("/updateEventAttendeeData")
    public void updateEventAttendeeData(@RequestBody EventAttendee eventAttendee) {
        eventService.updateEventAttendeeData(eventAttendee);
    }


    @GetMapping("/GetEventUserPersonData")
    public List<EventUserPerson> getEventUserPersonData(@RequestParam ("PERSON_PK_ID") String personPkId) {
        return eventService.getEventUserPersonData(personPkId);
    }
    @PostMapping("/postEventUserPersonData")
    public void postEventUserPersonData(@RequestBody EventUserPerson eventUserPerson) {
        eventService.postEventUserPersonData(eventUserPerson);
    }
    @DeleteMapping("/postEventUserPersonData")
    public void deleteEventUserPersonData(@RequestParam ("PERSON_PK_ID") String personPkId) {
        eventService.deleteEventUserPersonData(personPkId);
    }
    @PutMapping("/updateEventUserPersonData")
    public void updateEventUserPersonData(@RequestBody EventUserPerson eventUserPerson) {
        eventService.updateEventUserPersonData(eventUserPerson);
    }
}
