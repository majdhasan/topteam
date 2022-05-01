package life.majd.backend.domain.service;

import life.majd.backend.domain.model.Event;
import life.majd.backend.domain.model.EventLocation;
import life.majd.backend.domain.model.Person;
import java.util.Optional;
import java.util.Set;

public interface LocationService {

  Optional<EventLocation> getEventLocation(Long id);

  Optional<EventLocation> getEventLocation(Event event);

  Set<EventLocation> getEventLocations(String city);

  Set<EventLocation> getEventLocations(Person person);


  void createLocation(EventLocation location);

  void deleteLocation(EventLocation location);

  void updateLocation(EventLocation location);


}
