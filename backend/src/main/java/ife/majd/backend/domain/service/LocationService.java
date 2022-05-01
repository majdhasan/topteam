package ife.majd.backend.domain.service;

import ife.majd.backend.domain.model.Event;
import ife.majd.backend.domain.model.SearchArea;
import ife.majd.backend.repository.postgres.entity.EventEntity;
import ife.majd.backend.repository.postgres.entity.EventLocationEntity;
import java.util.Set;

public interface LocationService {

  Set<EventLocationEntity> getLocations(String city);

  void createEvent(Event event);

  void deleteEvent(String evendId);

  void updateEvent(Event event);


}
