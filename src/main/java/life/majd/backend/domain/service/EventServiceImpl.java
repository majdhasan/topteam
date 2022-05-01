package life.majd.backend.domain.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import life.majd.backend.domain.model.Event;
import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.domain.model.Person;
import life.majd.backend.domain.model.SearchArea;
import life.majd.backend.repository.postgres.EventLocationRepository;
import life.majd.backend.repository.postgres.EventRepository;
import life.majd.backend.repository.postgres.PersonRepository;
import life.majd.backend.repository.postgres.entity.EventEntity;
import life.majd.backend.repository.postgres.entity.EventLocationEntity;
import life.majd.backend.repository.postgres.entity.PersonEntity;
import life.majd.backend.repository.postgres.mappers.EventMapper;
import life.majd.backend.repository.postgres.mappers.PersonMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventServiceImpl implements EventService {

  private EventRepository eventRepository;

  private EventLocationRepository eventLocationRepository;
  private EventMapper eventMapper;
  private PersonMapper personMapper;
  private PersonRepository personRepository;

  @Override
  public Set<Event> getEvents(SearchArea searchArea) {

    return null;
  }

  @Override
  public Set<Event> getEvents(EventLocation location) {
    Set<Event> events = new HashSet<>();
    Optional<EventLocationEntity> eventLocationEntity = eventLocationRepository.findById(
        location.getId());
    if (eventLocationEntity.isPresent()) {
      Set<EventEntity> eventEntitiesByLocation = eventRepository.findEventEntitiesByLocation(
          eventLocationEntity.get());
      events = eventEntitiesByLocation.stream()
          .map(eventEntity -> eventMapper.eventEntityToModel(eventEntity)).collect(
              Collectors.toSet());

    }
    return events;
  }

  @Override
  public Set<Event> getEvents(Person person) {
    Set<Event> events = new HashSet<>();
    Optional<PersonEntity> personEntity = personRepository.findById(
        person.getId());
    if (personEntity.isPresent()) {
      Set<EventEntity> eventEntitiesByOrganizer = eventRepository.findEventEntitiesByOrganizer(
          personEntity.get());
      events = eventEntitiesByOrganizer.stream()
          .map(eventEntity -> eventMapper.eventEntityToModel(eventEntity)).collect(
              Collectors.toSet());

    }
    return events;
  }

  @Override
  public void createEvent(Event event) {

    EventEntity eventEntity = eventMapper.eventModelToEntity(event);
    eventRepository.save(eventEntity);
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
