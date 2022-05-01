package life.majd.backend.domain.service;

import life.majd.backend.domain.model.Event;
import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.domain.model.Person;
import life.majd.backend.domain.model.SearchArea;
import java.util.Set;

public interface EventService {

  Set<Event> getEvents(SearchArea searchArea);

  Set<Event> getEvents(EventLocation location);

  Set<Event> getEvents(Person person);

  void createEvent(Event event);

  void deleteEvent(Event event);

  void updateEvent(Event event);


}
