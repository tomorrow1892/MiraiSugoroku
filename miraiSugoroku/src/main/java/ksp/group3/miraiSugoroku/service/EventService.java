package ksp.group3.miraiSugoroku.service;

import ksp.group3.miraiSugoroku.entity.Event;
import ksp.group3.miraiSugoroku.form.EventForm;
import ksp.group3.miraiSugoroku.repository.CreaterRepository;
import ksp.group3.miraiSugoroku.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eRepo;

    @Autowired
    CreaterRepository cRepo;

    public Event createEvent(EventForm eventForm) {
        Event e = eventForm.toEntity();

        return eRepo.save(e);
    }

    public Event getEvent(long eventId) {
        eRepo.findById(eventId);
    }

    public Event updateEvent(EventForm eventForm) {

    }

    public Event deleteEvent(long eventId) {

    }

    List<Event> filterEventsByYear(int year) {

    }

    List<Event> getActiveEvents(Date day) {

    }
}
