package ife.majd.backend.domain.service;

import ife.majd.backend.domain.model.Event;
import ife.majd.backend.domain.model.SearchArea;
import ife.majd.backend.repository.postgres.entity.EventEntity;
import java.util.Set;

public interface EventService {

  Set<EventEntity> getEvents(SearchArea searchArea);

  void createEvent(Event event);

  void deleteEvent(Long evendId);

  void updateEvent(Event event);


}
