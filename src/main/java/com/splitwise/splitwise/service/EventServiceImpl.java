package com.splitwise.splitwise.service;

import com.splitwise.splitwise.entities.Event;
import com.splitwise.splitwise.entities.EventAttendee;
import com.splitwise.splitwise.entities.EventUserPerson;
import com.splitwise.splitwise.repository.EventAttendeeRepositiory;
import com.splitwise.splitwise.repository.EventRepositiory;
import com.splitwise.splitwise.repository.EventUserPersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepositiory eventRepositiory;
    @Autowired
    EventAttendeeRepositiory eventAttendeeRepositiory;
    @Autowired
    EventUserPersonRepository eventUserPersonRepository;

    public List<Event> getEventData(String eventPkId) {
        List<Event> list = new ArrayList<>();
        if (eventPkId != null && !eventPkId.isEmpty() && !"null".equals(eventPkId)) {
            Integer Id = Integer.parseInt(eventPkId);
            list = eventRepositiory.findByEventPkId(Id);
        } else {
            list = eventRepositiory.findAll();
        }

        // to fetch attendee data
        if(list!=null){
            for (Event event : list) {
                List<EventAttendee> eventAttendeeList = eventAttendeeRepositiory.findByEventFkId(event.getEventPkId());
                if(eventAttendeeList!=null){
                    for (EventAttendee eventAttendee : eventAttendeeList) {
                        List<EventUserPerson> eventUserPersonList= eventUserPersonRepository.findByPersonPkId(eventAttendee.getPersonFkId());
                        eventAttendee.setEventUserPersonList(eventUserPersonList);
                    }
                }
                event.setEventAttendeeList(eventAttendeeList);
            }
        }

        return list;
    }


    public void postEventData(Event event){
        if(event != null){
          Event  event1=  eventRepositiory.save(event);
          if(event.getEventAttendeeList().size()>0
          ){
              for(EventAttendee eventAttendee:event.getEventAttendeeList()){
                  eventAttendee.setEventFkId(event1.getEventPkId());
                  postEventAttendeeData( eventAttendee);
              }
          }
        }
    }
    @Transactional
    public void deleteEventData(String eventPkId){
        if(eventPkId != null && !eventPkId.isEmpty()){
            Integer Id=Integer.parseInt(eventPkId);
            eventRepositiory.deleteByEventPkId(Id);
        }
    }
    @Transactional
    public void updateEventData(Event event){
        if(event != null){
            eventRepositiory.updateEventData(event.getEventPkId(),event.getEventTitle(),event.getEventDesc(),event.getEventStartDateTime(),event.getEventEndDateTime(),event.getEventLocation());
        }
    }



    public List<Event> getEventAttendeeData(String eventAttendeePkId){
        List<Event> list = new ArrayList<>();
        if(eventAttendeePkId != null && !eventAttendeePkId.isEmpty()){
            Integer Id=Integer.parseInt(eventAttendeePkId);
            list = eventAttendeeRepositiory.findByEventAttendeePkId(Id);
        }else{
            list =  eventRepositiory.findAll();
        }
        return list;
    }
    public void postEventAttendeeData(EventAttendee eventAttendee){
        if(eventAttendee != null){
            eventAttendeeRepositiory.save(eventAttendee);
        }
    }
    public void deleteEventAttendeeData(String eventAttendeePkId){
        if(eventAttendeePkId != null && !eventAttendeePkId.isEmpty()){
            Integer Id=Integer.parseInt(eventAttendeePkId);
            eventAttendeeRepositiory.deleteByEventAttendeePkId(Id);
        }
    }
    @Transactional
    public void updateEventAttendeeData(EventAttendee eventAttendee){
        if(eventAttendee != null){
            eventAttendeeRepositiory.updateEventAttendeeData(eventAttendee.getEventAttendeePkId(),eventAttendee.getPersonFkId(),eventAttendee.getEventFkId());
        }
    }



    public List<EventUserPerson> getEventUserPersonData(String personPkId){
        List<EventUserPerson> list = new ArrayList<>();
        if(personPkId != null && !personPkId.isEmpty() && !personPkId.equals("null")){
            Integer Id=Integer.parseInt(personPkId);
            list=eventUserPersonRepository.findByPersonPkId(Id);
        }else{
            list =  eventUserPersonRepository.findAll();
        }
        return list;
    }

    public void postEventUserPersonData(EventUserPerson eventUserPerson){
        if(eventUserPerson != null){
            eventUserPersonRepository.save(eventUserPerson);
        }
    }
    public void deleteEventUserPersonData(String personPkId){
        if(personPkId != null && !personPkId.isEmpty()){
            Integer Id=Integer.parseInt(personPkId);
            eventUserPersonRepository.deleteByPersonPkId(Id);
        }
    }

    @Transactional
    public void updateEventUserPersonData(EventUserPerson eventUserPerson){
        if(eventUserPerson != null){
            eventUserPersonRepository.updateEventUserPersonData(eventUserPerson.getPersonPkId(),eventUserPerson.getPersonName(),eventUserPerson.getPersonDesignation());
        }
    }

    }
