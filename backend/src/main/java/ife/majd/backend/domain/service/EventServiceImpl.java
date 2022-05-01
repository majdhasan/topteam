package ife.majd.backend.domain.service;

import ife.majd.backend.domain.model.Event;
import ife.majd.backend.domain.model.SearchArea;
import ife.majd.backend.repository.postgres.EventRepository;
import ife.majd.backend.repository.postgres.entity.EventEntity;
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
  public Set<EventEntity> getEvents(SearchArea searchArea) {
    return null;
  }

  @Override
  public void createEvent(Event event) {

  }

  @Override
  public void deleteEvent(Long evendId) {
    Optional<EventEntity> eventEntity = eventRepository.findById(evendId);
    eventEntity.ifPresent(entity -> {
      eventRepository.delete(entity);
//      log.info("{} has been deleted", eventEntity.get().getId());
    });

  }

  @Override
  public void updateEvent(Event event) {

  }
}
