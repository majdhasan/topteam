package life.majd.backend.domain.service;

import life.majd.backend.domain.model.Event;
import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.domain.model.Person;
import life.majd.backend.domain.model.SearchArea;
import life.majd.backend.repository.postgres.EventRepository;
import life.majd.backend.repository.postgres.entity.EventEntity;
import java.util.Optional;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventServiceImpl implements EventService {

  private EventRepository eventRepository;

  @Override
  public Set<Event> getEvents(SearchArea searchArea) {
    return null;
  }

  @Override
  public Set<Event> getEvents(EventLocation location) {
    return null;
  }

  @Override
  public Set<Event> getEvents(Person person) {
    return null;
  }

  @Override
  public void createEvent(Event event) {

  }

  @Override
  public void deleteEvent(Event event) {
    Optional<EventEntity> eventEntity = eventRepository.findById(event.getId());
    eventEntity.ifPresent(entity -> {
      eventRepository.delete(entity);
//      log.info("{} has been deleted", eventEntity.get().getId());
    });

  }

  @Override
  public void updateEvent(Event event) {

  }
}